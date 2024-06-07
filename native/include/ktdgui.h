#ifndef __KTDGUI_H__
#define __KTDGUI_H__

#if defined(_WIN32)
	#define KTDGUI_DLL_IMPORT __declspec(dllimport)
#else
	#define KTDGUI_DLL_IMPORT __attribute__((visibility("default")))
#endif

#endif /* __KTDGUI_H__ */
