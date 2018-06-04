package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase1;
import com.hp.hpl.jena.sparql.function.FunctionBase2;
import com.hp.hpl.jena.sparql.function.FunctionBase4;

public class WSUM extends FunctionBase4
{
public WSUM() { super() ; }

@Override
public NodeValue exec(NodeValue weight1, NodeValue truth1, NodeValue weight2, NodeValue truth2)
{ return XSDFuncOp.numAdd(XSDFuncOp.numMultiply(truth1, weight1),XSDFuncOp.numMultiply(truth2,weight2)) ; }
}
