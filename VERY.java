package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase1;
import com.hp.hpl.jena.sparql.function.FunctionBase2;

 

	public class VERY extends FunctionBase1
	{
	public VERY() { super() ; }

	@Override
	public NodeValue exec(NodeValue nv)
	{ return XSDFuncOp.numMultiply(nv, nv);}
	}

