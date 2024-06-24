package cc.squirreljme.ktgui.pipe;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Base interface for connection pipes.
 * 
 * @since 2024/06/23
 */
public interface ProgramPipe
	extends Closeable
{
	/**
	 * Returns standard input.
	 * 
	 * @return Standard input.
	 * @throws IOException If the stream could not be obtained.
	 * @since 2024/06/23
	 */
	OutputStream stdIn()
		throws IOException;
	
	/**
	 * Returns standard output.
	 * 
	 * @return Standard output.
	 * @throws IOException If the stream could not be obtained.
	 * @since 2024/06/23
	 */
	InputStream stdOut()
		throws IOException;
	
	/**
	 * Returns standard error.
	 * 
	 * @return Standard error.
	 * @throws IOException If the stream could not be obtained.
	 * @since 2024/06/23
	 */
	InputStream stdErr()
		throws IOException;
}
