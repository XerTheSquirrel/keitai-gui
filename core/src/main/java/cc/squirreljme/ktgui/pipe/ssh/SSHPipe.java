// -*- Mode: Java; indent-tabs-mode: t; tab-width: 4 -*-
// ---------------------------------------------------------------------------
// Keitai GUI
//     Copyright (C) Stephanie Gawroriski <xer@multiphasicapps.net>
// ---------------------------------------------------------------------------
// Keitai GUI is under the Mozilla Public License Version 2.0.
// See license.mkd for licensing and copyright information.
// ---------------------------------------------------------------------------

package cc.squirreljme.ktgui.pipe.ssh;

import cc.squirreljme.ktgui.pipe.ProgramPipe;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Connects to another system via SSH.
 *
 * @since 2024/06/23
 */
public class SSHPipe
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
