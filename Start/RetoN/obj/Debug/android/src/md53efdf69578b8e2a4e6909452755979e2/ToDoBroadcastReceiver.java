package md53efdf69578b8e2a4e6909452755979e2;


public class ToDoBroadcastReceiver
	extends md5214eafb7e7b3b7fcc363a68a6358563f.GcmBroadcastReceiverBase_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("RetoN.ToDoBroadcastReceiver, devxamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ToDoBroadcastReceiver.class, __md_methods);
	}


	public ToDoBroadcastReceiver () throws java.lang.Throwable
	{
		super ();
		if (getClass () == ToDoBroadcastReceiver.class)
			mono.android.TypeManager.Activate ("RetoN.ToDoBroadcastReceiver, devxamarin, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
