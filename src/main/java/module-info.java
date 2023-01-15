/**
 * @author VISTALL
 * @since 15/01/2023
 */
module consulo.opencover
{
	requires consulo.ide.api;

	requires consulo.dotnet.api;
	requires consulo.dotnet.microsoft;
	requires consulo.dotnet.execution.api;
	requires consulo.dotnet.execution.impl;

	requires jakarta.xml.bind;
}