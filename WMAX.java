package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase1;
import com.hp.hpl.jena.sparql.function.FunctionBase2;
import com.hp.hpl.jena.sparql.function.FunctionBase4;

public class WMAX extends FunctionBase4
{
public WMAX() { super() ; }

@Override
public NodeValue exec(NodeValue weight1, NodeValue truth1, NodeValue weight2, NodeValue truth2)
{ 
	NodeValue n1 = XSDFuncOp.min(weight1, truth1);
	NodeValue n2 = XSDFuncOp.min(weight2, truth2);
	return XSDFuncOp.max(n1,n2) ; }
}
