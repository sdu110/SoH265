/*
 * 文件名：SoServer.java<br/>
 * 版权： Copyright 2016-2017 Chengdu CVHealth Tech. Co. Ltd. All Rights Reserved. <br/> 
 * 描述：<br/>
 * 修改人：曾邦福<br/>
 * 修改时间：2017-1-17<br/>
 * 修改内容：新增<br/>
 * 修改内容：<br/>
 * 走读人：<br/>
 * 走读时间：<br/>
 * 走读备注：<br/>
 */
package com.so.dw.android.sovideo;

/**
 * <br/>
 * @author 曾邦福
 * @version 1.0,2017-1-17
 */
public class SoServer
{

	static
	{
		try
		{
			System.loadLibrary("SoVideo");
		}
		catch (java.lang.Exception e)
		{
		}
	}
	public static SoServer _instance = null;

	public static SoServer getInstance()
	{
		if (_instance == null)
		{
			_instance = new SoServer();
		}
		return _instance;
	}

	public void test()
	{
		testNative();
	}

	public int[] testYUV(int[] data, int width, int height)
	{
		return testYUVNative(data, width, height);
	}

	public void decodeYUV(byte[] data, int width, int height)
	{
		decodeYUVNative(data, width, height);
	}

	public int start(int port)
	{
		return onStart(port);
	}

	public int stop()
	{
		return onStop();
	}

	private native void decodeYUVNative(byte[] data, int width, int height);

	private native int testNative();

	private native int[] testYUVNative(int[] data, int width, int height);

	private native int onStop();

	private native int onStart(int port);

	public native int regesitCallBack(Object callBack);

	public native int testCallBack();
}
