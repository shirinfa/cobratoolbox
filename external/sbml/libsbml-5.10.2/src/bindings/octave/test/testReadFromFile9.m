function y = testReadFromFile9

filename = fullfile(pwd,'test-data', 'notes_annotations.xml');
 m2 = sprintf('%s\n  %s %s %s %s %s %s\n    %s\n      %s\n        %s', ...
'<annotation>', ...
'<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"', ... 
'xmlns:dc="http://purl.org/dc/elements/1.1/"', ...
'xmlns:dcterms="http://purl.org/dc/terms/"', ... 
'xmlns:vCard="http://www.w3.org/2001/vcard-rdf/3.0#"', ... 
'xmlns:bqbiol="http://biomodels.net/biology-qualifiers/"', ... 
'xmlns:bqmodel="http://biomodels.net/model-qualifiers/">', ...
'<rdf:Description rdf:about="#_000001">', ...
'<dc:creator rdf:parseType="Resource">', ...
'<rdf:Bag>');
m1 = sprintf('\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n', ...
'          <rdf:li rdf:parseType="Resource">', ...
'            <vCard:N rdf:parseType="Resource">', ...
'              <vCard:Family>Shapiro</vCard:Family>', ...
'              <vCard:Given>Bruce</vCard:Given>', ...
'            </vCard:N>', ...
'            <vCard:EMAIL>bshapiro@jpl.nasa.gov</vCard:EMAIL>', ...
'            <vCard:ORG>', ...
'              <vCard:Orgname>NASA Jet Propulsion Laboratory</vCard:Orgname>', ...
'            </vCard:ORG>', ...
'          </rdf:li>', ...
'        </rdf:Bag>', ...
'      </dc:creator>', ...
'      <dcterms:created rdf:parseType="Resource">', ...
'        <dcterms:W3CDTF>2005-02-08T18:36:17Z</dcterms:W3CDTF>');


m3 = sprintf('%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s', ...
'      </dcterms:created>', ...
'      <dcterms:modified rdf:parseType="Resource">', ...
'        <dcterms:W3CDTF>2006-11-14T21:59:41Z</dcterms:W3CDTF>', ...
'      </dcterms:modified>', ...
'      <bqmodel:is>', ...
'        <rdf:Bag>', ...
'          <rdf:li rdf:resource="http://www.ebi.ac.uk/biomodels/#BIOMD0000000006"/>', ...
'        </rdf:Bag>', ...
'      </bqmodel:is>', ...
'      <bqmodel:isDescribedBy>', ...
'        <rdf:Bag>', ...
'          <rdf:li rdf:resource="http://www.pubmed.gov/#1831270"/>', ...
'        </rdf:Bag>', ...
'      </bqmodel:isDescribedBy>', ...
'    </rdf:Description>', ...
'  </rdf:RDF>', ...
'</annotation>');
  
    

model_ann = strcat(m2, m1, m3);

c1 = sprintf('%s\n  %s %s %s %s %s %s\n    %s\n      %s\n        %s', ...
'<annotation>', ...
'<rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"', ... 
'xmlns:dc="http://purl.org/dc/elements/1.1/"', ...
'xmlns:dcterms="http://purl.org/dc/terms/"', ... 
'xmlns:vCard="http://www.w3.org/2001/vcard-rdf/3.0#"', ... 
'xmlns:bqbiol="http://biomodels.net/biology-qualifiers/"', ... 
'xmlns:bqmodel="http://biomodels.net/model-qualifiers/">', ...
'<rdf:Description rdf:about="#_000002">', ...
'<bqbiol:is>', ...
'<rdf:Bag>');

c2 = sprintf('\n          %s\n        %s\n      %s\n    %s\n  %s\n%s', ...
'<rdf:li rdf:resource="http://www.geneontology.org/#GO:0005623"/>', ...
'</rdf:Bag>', ...
'</bqbiol:is>', ...
'</rdf:Description>', ...
'</rdf:RDF>', ...
'</annotation>');

comp_ann = strcat(c1, c2);

species_notes = sprintf('%s\n  %s\n    %s\n      %s\n        %s\n      %s\n    %s\n  %s\n%s', ...
'<notes>', ...
'<body xmlns="http://www.w3.org/1999/xhtml">', ...
'<p>', ...
'<h2>', ...
'<center>A Simple Mitotic Oscillator</center>', ...
'</h2>', ...
'</p>', ...
'</body>', ...
'</notes>');
  


m = TranslateSBML(filename);

test = 5;
Totalfail = 0;

Totalfail = Totalfail + fail_unless(m.SBML_level == 2);
Totalfail = Totalfail + fail_unless(m.SBML_version == 1);
Totalfail = Totalfail + fail_unless(strcmp(m.annotation, model_ann));
Totalfail = Totalfail + fail_unless(strcmp(m.compartment(1).annotation, comp_ann));
Totalfail = Totalfail + fail_unless(strcmp(m.species(1).notes, species_notes));

disp('Testing readFromFile9:');
disp(sprintf('Number tests: %d', test));
disp(sprintf('Number fails: %d', Totalfail));
disp(sprintf('Pass rate: %d%%\n', ((test-Totalfail)/test)*100));

if (Totalfail == 0)
    y = 0;
else
    y = 1;
end;

function y = fail_unless(arg)

if (~arg)
    y = 1;
else
    y = 0;
end;
    
