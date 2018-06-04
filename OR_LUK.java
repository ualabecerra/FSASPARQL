package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase2;

public class OR_LUK extends FunctionBase2
{
public OR_LUK() { super() ; }

@Override
public NodeValue exec(NodeValue nv1, NodeValue nv2)
{ return XSDFuncOp.min(XSDFuncOp.numAdd(nv1, nv2),NodeValue.makeInteger(1)) ; }
}
