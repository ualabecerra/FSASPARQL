package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase1;
import com.hp.hpl.jena.sparql.function.FunctionBase2;

public class AND_LUK extends FunctionBase2
{
public AND_LUK() { super() ; }

@Override
public NodeValue exec(NodeValue nv1, NodeValue nv2)
{ return XSDFuncOp.max(XSDFuncOp.numSubtract(XSDFuncOp.numAdd(nv1, nv2),NodeValue.makeInteger(1)),NodeValue.makeInteger(0)) ; }
}
