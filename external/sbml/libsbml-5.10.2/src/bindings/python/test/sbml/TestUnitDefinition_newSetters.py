#
# @file    TestUnitDefinition_newSetters.py
# @brief   SBML UnitDefinition unit tests for new API
#
# @author  Akiya Jouraku (Python conversion)
# @author  sarah Keating 
# 
# ====== WARNING ===== WARNING ===== WARNING ===== WARNING ===== WARNING ======
#
# DO NOT EDIT THIS FILE.
#
# This file was generated automatically by converting the file located at
# src/sbml/test/TestUnitDefinition_newSetters.c
# using the conversion program dev/utilities/translateTests/translateTests.pl.
# Any changes made here will be lost the next time the file is regenerated.
#
# -----------------------------------------------------------------------------
# This file is part of libSBML.  Please visit http://sbml.org for more
# information about SBML, and the latest version of libSBML.
#
# Copyright 2005-2010 California Institute of Technology.
# Copyright 2002-2005 California Institute of Technology and
#                     Japan Science and Technology Corporation.
# 
# This library is free software; you can redistribute it and/or modify it
# under the terms of the GNU Lesser General Public License as published by
# the Free Software Foundation.  A copy of the license agreement is provided
# in the file named "LICENSE.txt" included with this software distribution
# and also available online as http://sbml.org/software/libsbml/license.html
# -----------------------------------------------------------------------------

import sys
import unittest
import libsbml


class TestUnitDefinition_newSetters(unittest.TestCase):

  global UD
  UD = None

  def setUp(self):
    self.UD = libsbml.UnitDefinition(2,4)
    if (self.UD == None):
      pass    
    pass  

  def tearDown(self):
    _dummyList = [ self.UD ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_addUnit1(self):
    m = libsbml.UnitDefinition(2,2)
    p = libsbml.Unit(2,2)
    i = m.addUnit(p)
    self.assert_( i == libsbml.LIBSBML_INVALID_OBJECT )
    p.setKind(libsbml.UNIT_KIND_MOLE)
    i = m.addUnit(p)
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assert_( m.getNumUnits() == 1 )
    _dummyList = [ p ]; _dummyList[:] = []; del _dummyList
    _dummyList = [ m ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_addUnit2(self):
    m = libsbml.UnitDefinition(2,2)
    p = libsbml.Unit(2,1)
    p.setKind(libsbml.UNIT_KIND_MOLE)
    i = m.addUnit(p)
    self.assert_( i == libsbml.LIBSBML_VERSION_MISMATCH )
    self.assert_( m.getNumUnits() == 0 )
    _dummyList = [ p ]; _dummyList[:] = []; del _dummyList
    _dummyList = [ m ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_addUnit3(self):
    m = libsbml.UnitDefinition(2,2)
    p = libsbml.Unit(1,2)
    p.setKind(libsbml.UNIT_KIND_MOLE)
    i = m.addUnit(p)
    self.assert_( i == libsbml.LIBSBML_LEVEL_MISMATCH )
    self.assert_( m.getNumUnits() == 0 )
    _dummyList = [ p ]; _dummyList[:] = []; del _dummyList
    _dummyList = [ m ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_addUnit4(self):
    m = libsbml.UnitDefinition(2,2)
    p = None
    i = m.addUnit(p)
    self.assert_( i == libsbml.LIBSBML_OPERATION_FAILED )
    self.assert_( m.getNumUnits() == 0 )
    _dummyList = [ m ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_createUnit(self):
    m = libsbml.UnitDefinition(2,2)
    p = m.createUnit()
    self.assert_( m.getNumUnits() == 1 )
    self.assert_( (p).getLevel() == 2 )
    self.assert_( (p).getVersion() == 2 )
    _dummyList = [ m ]; _dummyList[:] = []; del _dummyList
    pass  

  def test_UnitDefinition_setId1(self):
    i = self.UD.setId( "mmls")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assert_((  "mmls" == self.UD.getId() ))
    self.assertEqual( True, self.UD.isSetId() )
    i = self.UD.setId("")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assertEqual( False, self.UD.isSetId() )
    i = self.UD.setId( "123")
    self.assert_( i == libsbml.LIBSBML_INVALID_ATTRIBUTE_VALUE )
    self.assertEqual( False, self.UD.isSetId() )
    pass  

  def test_UnitDefinition_setName1(self):
    i = self.UD.setName( "mmls")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assert_((  "mmls" == self.UD.getName() ))
    self.assertEqual( True, self.UD.isSetName() )
    i = self.UD.setName("")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assertEqual( False, self.UD.isSetName() )
    i = self.UD.setName( "123")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assertEqual( True, self.UD.isSetName() )
    pass  

  def test_UnitDefinition_setName2(self):
    i = self.UD.setName( "mmls")
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assert_((  "mmls" == self.UD.getName() ))
    self.assertEqual( True, self.UD.isSetName() )
    i = self.UD.unsetName()
    self.assert_( i == libsbml.LIBSBML_OPERATION_SUCCESS )
    self.assertEqual( False, self.UD.isSetName() )
    pass  

def suite():
  suite = unittest.TestSuite()
  suite.addTest(unittest.makeSuite(TestUnitDefinition_newSetters))

  return suite

if __name__ == "__main__":
  if unittest.TextTestRunner(verbosity=1).run(suite()).wasSuccessful() :
    sys.exit(0)
  else:
    sys.exit(1)
