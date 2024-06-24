package cc.squirreljme.ktgui.pipe.local;

import cc.squirreljme.ktgui.pipe.ProgramPipe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class LocalPipe
	implements ProgramPipe
{
	@Override
	public void close()
		throws IOException
	{
		throw new Error("TODO");
	}
	
	@Override
	public OutputStream stdIn()
		throws IOException
	{
		throw new Error("TODO");
	}
	
	@Override
	public InputStream stdOut()
		throws IOException
	{
		throw new Error("TODO");
	}
	
	@Override
	public InputStream stdErr()
		throws IOException
	{
		throw new Error("TODO");
	}
}
