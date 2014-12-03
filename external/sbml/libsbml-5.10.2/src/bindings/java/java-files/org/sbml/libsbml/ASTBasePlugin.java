/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sbml.libsbml;

/** 
 *  Base class for extensions that plug into AST classes.
 * @internal
 */

public class ASTBasePlugin {
   private long swigCPtr;
   protected boolean swigCMemOwn;

   protected ASTBasePlugin(long cPtr, boolean cMemoryOwn)
   {
     swigCMemOwn = cMemoryOwn;
     swigCPtr    = cPtr;
   }

   protected static long getCPtr(ASTBasePlugin obj)
   {
     return (obj == null) ? 0 : obj.swigCPtr;
   }

   protected static long getCPtrAndDisown (ASTBasePlugin obj)
   {
     long ptr = 0;

     if (obj != null)
     {
       ptr             = obj.swigCPtr;
       obj.swigCMemOwn = false;
     }

     return ptr;
   }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libsbmlJNI.delete_ASTBasePlugin(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  
/**
   * Creates and returns a deep copy of this {@link ASTBasePlugin} object.
   <p>
   * @return the (deep) copy of this {@link ASTBasePlugin} object.
   * @internal
   */ public
 ASTBasePlugin cloneObject() {
    long cPtr = libsbmlJNI.ASTBasePlugin_cloneObject(swigCPtr, this);
    return (cPtr == 0) ? null : new ASTBasePlugin(cPtr, true);
  }

  
/**
   * Returns the XML namespace (URI) of the package extension
   * of this plugin object.
   <p>
   * @return the URI of the package extension of this plugin object.
   * @internal
   */ public
 String getElementNamespace() {
    return libsbmlJNI.ASTBasePlugin_getElementNamespace(swigCPtr, this);
  }

  
/**
   * Returns the prefix of the package extension of this plugin object.
   <p>
   * @return the prefix of the package extension of this plugin object.
   * @internal
   */ public
 String getPrefix() {
    return libsbmlJNI.ASTBasePlugin_getPrefix(swigCPtr, this);
  }

  
/**
   * Returns the package name of this plugin object.
   <p>
   * @return the package name of this plugin object.
   * @internal
   */ public
 String getPackageName() {
    return libsbmlJNI.ASTBasePlugin_getPackageName(swigCPtr, this);
  }

  
/** * @internal */ public
 int setSBMLExtension(SBMLExtension ext) {
    return libsbmlJNI.ASTBasePlugin_setSBMLExtension(swigCPtr, this, SBMLExtension.getCPtr(ext), ext);
  }

  
/** * @internal */ public
 int setPrefix(String prefix) {
    return libsbmlJNI.ASTBasePlugin_setPrefix(swigCPtr, this, prefix);
  }

  
/**
   * Sets the parent SBML object of this plugin object to
   * this object and child elements (if any).
   * (Creates a child-parent relationship by this plugin object)
   <p>
   * This function is called when this object is created by
   * the parent element.
   * Subclasses must override this this function if they have one
   * or more child elements. Also, {@link ASTBasePlugin#connectToParent(SBase)}
   * must be called in the overridden function.
   <p>
   * @param sbase the {@link SBase} object to use
   <p>
   * @see setSBMLDocument
   * @see enablePackageInternal
   * @internal
   */ public
 void connectToParent(ASTBase astbase) {
    libsbmlJNI.ASTBasePlugin_connectToParent(swigCPtr, this, ASTBase.getCPtr(astbase), astbase);
  }

  
/**
   * Enables/Disables the given package with child elements in this plugin 
   * object (if any).
   * (This is an internal implementation invoked from 
   *  {@link SBase#enablePackageInternal()} function)
   <p>
   * Subclasses which contain one or more {@link SBase} derived elements should 
   * override this function if elements defined in them can be extended by
   * some other package extension.
   <p>
   * @see setSBMLDocument
   * @see connectToParent
   * @internal
   */ public
 void enablePackageInternal(String pkgURI, String pkgPrefix, boolean flag) {
    libsbmlJNI.ASTBasePlugin_enablePackageInternal(swigCPtr, this, pkgURI, pkgPrefix, flag);
  }

  
/** * @internal */ public
 boolean stripPackage(String pkgPrefix, boolean flag) {
    return libsbmlJNI.ASTBasePlugin_stripPackage(swigCPtr, this, pkgPrefix, flag);
  }

  
/**
   * Gets the URI to which this element belongs to.
   * For example, all elements that belong to SBML Level 3 Version 1 Core
   * must would have the URI 'http://www.sbml.org/sbml/level3/version1/core'; 
   * all elements that belong to Layout Extension Version 1 for SBML Level 3
   * Version 1 Core must would have the URI
   * 'http://www.sbml.org/sbml/level3/version1/layout/version1/'
   <p>
   * Unlike getElementNamespace, this function first returns the URI for this 
   * element by looking into the {@link SBMLNamespaces} object of the document with 
   * the its package name. if not found it will return the result of 
   * getElementNamespace
   <p>
   * @return the URI this elements  
   <p>
   * @see getPackageName
   * @see getElementNamespace
   * @see SBMLDocument#getSBMLNamespaces
   * @see getSBMLDocument
   * @internal
   */ public
 String getURI() {
    return libsbmlJNI.ASTBasePlugin_getURI(swigCPtr, this);
  }

  
/**
   * Returns the parent {@link ASTNode} object to which this plugin 
   * object connected.
   <p>
   * @return the parent {@link ASTNode} object to which this plugin 
   * object connected.
   * @internal
   */ public
 ASTBase getParentASTObject() {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getParentASTObject__SWIG_0(swigCPtr, this), false);
}

  
/**
   * Sets the XML namespace to which this element belongs to.
   * For example, all elements that belong to SBML Level 3 Version 1 Core
   * must set the namespace to 'http://www.sbml.org/sbml/level3/version1/core'; 
   * all elements that belong to Layout Extension Version 1 for SBML Level 3
   * Version 1 Core must set the namespace to 
   * 'http://www.sbml.org/sbml/level3/version1/layout/version1/'
   <p>
   * @return integer value indicating success/failure of the
   * function.   The possible values
   * returned by this function are:
   * <ul>
   * <li> {@link libsbmlConstants#LIBSBML_OPERATION_SUCCESS LIBSBML_OPERATION_SUCCESS}
   * <li> {@link libsbmlConstants#LIBSBML_INVALID_ATTRIBUTE_VALUE LIBSBML_INVALID_ATTRIBUTE_VALUE}
   * @internal
   * </ul>
   */ public
 int setElementNamespace(String uri) {
    return libsbmlJNI.ASTBasePlugin_setElementNamespace(swigCPtr, this, uri);
  }

  
/**
   * Returns the SBML level of the package extension of 
   * this plugin object.
   <p>
   * @return the SBML level of the package extension of
   * this plugin object.
   * @internal
   */ public
 long getLevel() {
    return libsbmlJNI.ASTBasePlugin_getLevel(swigCPtr, this);
  }

  
/**
   * Returns the SBML version of the package extension of
   * this plugin object.
   <p>
   * @return the SBML version of the package extension of
   * this plugin object.
   * @internal
   */ public
 long getVersion() {
    return libsbmlJNI.ASTBasePlugin_getVersion(swigCPtr, this);
  }

  
/**
   * Returns the package version of the package extension of
   * this plugin object.
   <p>
   * @return the package version of the package extension of
   * this plugin object.
   * @internal
   */ public
 long getPackageVersion() {
    return libsbmlJNI.ASTBasePlugin_getPackageVersion(swigCPtr, this);
  }

  
/** * @internal */ public
 SBMLNamespaces getSBMLNamespaces() {
  return libsbml.DowncastSBMLNamespaces(libsbmlJNI.ASTBasePlugin_getSBMLNamespaces(swigCPtr, this), false);
}

  
/** * @internal */ public
 boolean isSetMath() {
    return libsbmlJNI.ASTBasePlugin_isSetMath(swigCPtr, this);
  }

  
/** * @internal */ public
 ASTBase getMath() {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getMath(swigCPtr, this), false);
}

  
/** * @internal */ public
 void createMath(int type) {
    libsbmlJNI.ASTBasePlugin_createMath(swigCPtr, this, type);
  }

  
/** * @internal */ public
 int addChild(ASTBase child) {
    return libsbmlJNI.ASTBasePlugin_addChild(swigCPtr, this, ASTBase.getCPtr(child), child);
  }

  
/** * @internal */ public
 ASTBase getChild(long n) {
  return libsbml.DowncastASTBase(libsbmlJNI.ASTBasePlugin_getChild(swigCPtr, this, n), false);
}

  
/** * @internal */ public
 long getNumChildren() {
    return libsbmlJNI.ASTBasePlugin_getNumChildren(swigCPtr, this);
  }

  
/** * @internal */ public
 int insertChild(long n, ASTBase newChild) {
    return libsbmlJNI.ASTBasePlugin_insertChild(swigCPtr, this, n, ASTBase.getCPtr(newChild), newChild);
  }

  
/** * @internal */ public
 int prependChild(ASTBase newChild) {
    return libsbmlJNI.ASTBasePlugin_prependChild(swigCPtr, this, ASTBase.getCPtr(newChild), newChild);
  }

  
/** * @internal */ public
 int removeChild(long n) {
    return libsbmlJNI.ASTBasePlugin_removeChild(swigCPtr, this, n);
  }

  
/** * @internal */ public
 int replaceChild(long n, ASTBase newChild) {
    return libsbmlJNI.ASTBasePlugin_replaceChild(swigCPtr, this, n, ASTBase.getCPtr(newChild), newChild);
  }

  
/** * @internal */ public
 int swapChildren(SWIGTYPE_p_ASTFunction that) {
    return libsbmlJNI.ASTBasePlugin_swapChildren(swigCPtr, this, SWIGTYPE_p_ASTFunction.getCPtr(that));
  }

  
/** * @internal */ public
 boolean read(XMLInputStream stream, String reqd_prefix, XMLToken currentElement) {
    return libsbmlJNI.ASTBasePlugin_read(swigCPtr, this, XMLInputStream.getCPtr(stream), stream, reqd_prefix, XMLToken.getCPtr(currentElement), currentElement);
  }

  
/** * @internal */ public
 void addExpectedAttributes(SWIGTYPE_p_ExpectedAttributes attributes, XMLInputStream stream, int type) {
    libsbmlJNI.ASTBasePlugin_addExpectedAttributes(swigCPtr, this, SWIGTYPE_p_ExpectedAttributes.getCPtr(attributes), XMLInputStream.getCPtr(stream), stream, type);
  }

  
/** * @internal */ public
 boolean readAttributes(XMLAttributes attributes, SWIGTYPE_p_ExpectedAttributes expectedAttributes, XMLInputStream stream, XMLToken element, int type) {
    return libsbmlJNI.ASTBasePlugin_readAttributes(swigCPtr, this, XMLAttributes.getCPtr(attributes), attributes, SWIGTYPE_p_ExpectedAttributes.getCPtr(expectedAttributes), XMLInputStream.getCPtr(stream), stream, XMLToken.getCPtr(element), element, type);
  }

  
/** * @internal */ public
 void writeAttributes(XMLOutputStream stream, int type) {
    libsbmlJNI.ASTBasePlugin_writeAttributes(swigCPtr, this, XMLOutputStream.getCPtr(stream), stream, type);
  }

  
/** * @internal */ public
 void writeXMLNS(XMLOutputStream stream) {
    libsbmlJNI.ASTBasePlugin_writeXMLNS(swigCPtr, this, XMLOutputStream.getCPtr(stream), stream);
  }

  
/** * @internal */ public
 boolean isNumberNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isNumberNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isFunctionNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isFunctionNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isLogical(int type) {
    return libsbmlJNI.ASTBasePlugin_isLogical(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isConstantNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isConstantNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isCSymbolFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_isCSymbolFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isCSymbolNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isCSymbolNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isName(int type) {
    return libsbmlJNI.ASTBasePlugin_isName(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isNumber(int type) {
    return libsbmlJNI.ASTBasePlugin_isNumber(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isOperator(int type) {
    return libsbmlJNI.ASTBasePlugin_isOperator(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isRelational(int type) {
    return libsbmlJNI.ASTBasePlugin_isRelational(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsQualifier(int type) {
    return libsbmlJNI.ASTBasePlugin_representsQualifier(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_isFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsUnaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsUnaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsBinaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsBinaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean representsNaryFunction(int type) {
    return libsbmlJNI.ASTBasePlugin_representsNaryFunction(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean hasCorrectNumberArguments(int type) {
    return libsbmlJNI.ASTBasePlugin_hasCorrectNumberArguments(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isWellFormedNode(int type) {
    return libsbmlJNI.ASTBasePlugin_isWellFormedNode(swigCPtr, this, type);
  }

  
/** * @internal */ public
 boolean isTopLevelMathMLFunctionNodeTag(String name) {
    return libsbmlJNI.ASTBasePlugin_isTopLevelMathMLFunctionNodeTag(swigCPtr, this, name);
  }

  
/** * @internal */ public
 boolean isTopLevelMathMLNumberNodeTag(String name) {
    return libsbmlJNI.ASTBasePlugin_isTopLevelMathMLNumberNodeTag(swigCPtr, this, name);
  }

  
/** * @internal */ public
 int getTypeFromName(String name) {
    return libsbmlJNI.ASTBasePlugin_getTypeFromName(swigCPtr, this, name);
  }

  
/** * @internal */ public
 String getNameFromType(int type) {
    return libsbmlJNI.ASTBasePlugin_getNameFromType(swigCPtr, this, type);
  }

}
