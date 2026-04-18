/**
 * @author VISTALL
 * @since 15/01/2023
 */
module consulo.opencover
{
	requires consulo.container.api;
	requires consulo.execution.coverage.api;
	requires consulo.module.api;
	requires consulo.module.content.api;
	requires consulo.process.api;
	requires consulo.util.collection;
	requires consulo.util.lang;

	requires consulo.dotnet.api;
	requires consulo.dotnet.microsoft;
	requires consulo.dotnet.execution.api;
	requires consulo.dotnet.execution.impl;

	requires jakarta.xml.bind;
}
