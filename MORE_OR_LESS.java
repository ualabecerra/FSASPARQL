package fsaSPARQL;

import com.hp.hpl.jena.sparql.expr.NodeValue;
import com.hp.hpl.jena.sparql.expr.nodevalue.XSDFuncOp;
import com.hp.hpl.jena.sparql.function.FunctionBase1;

public class MORE_OR_LESS extends FunctionBase1
{
public MORE_OR_LESS() { super() ; }

@Override
public NodeValue exec(NodeValue nv)
{ return XSDFuncOp.sqrt(nv);}
}
