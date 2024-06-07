#ifndef __LIBKEITAIFSTOOLS_H__
#define __LIBKEITAIFSTOOLS_H__

#include "ktdgui.h"

KTDGUI_DLL_IMPORT void xsr1coreInit(void);
KTDGUI_DLL_IMPORT void xsr1coreTerm(void);

/**
 * Returns the last error
 *
 * @param ppErrorMessage pointer to error message string pointer, thread-local
 * @param ppErrorStackTrace pointer to error stack trace string pointer,
 * thread-local
 * @param ppErrorFile pointer to error file string pointer, thread-local
 * @param ppErrorLine pointer to error line number pointer, thread-local
 */
KTDGUI_DLL_IMPORT void xsr1coreGetLastError(const char **ppErrorMessage,
	const char **ppErrorStackTrace,
	const char **ppErrorFile,
	int *ppErrorLine);

/**
 * Processes an XSR1 image
 * 
 * @param inputFileName input disk image file name
 * @param outputFileName output disk image file name
 * @return zero on success, non-zero on failure
 */
KTDGUI_DLL_IMPORT int xsr1coreParseImage(const char *inputFileName,
	const char *outputFileName);

#undef __LIBKEITAIFSTOOLS_H__
