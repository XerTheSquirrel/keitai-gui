package cc.squirreljme.ktgui.pipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Terminal buffer for parsing.
 * 
 * @since 2024/06/23
 */
public class TerminalBuffer
{
	/** The program pipe for input/output. */
	protected final ProgramPipe pipe;
	
	/** The console buffer lines. */
	private final List<String> _lines =
		new ArrayList<>();
	
	/**
	 * Initializes the pipe data processor.
	 * 
	 * @param __pipe The input pipe.
	 * @throws NullPointerException On null arguments.
	 * @since 2024/06/23
	 */
	public TerminalBuffer(ProgramPipe __pipe)
		throws NullPointerException
	{
		if (__pipe == null)
			throw new NullPointerException("NARG");
		
		this.pipe = __pipe;
	}
}
