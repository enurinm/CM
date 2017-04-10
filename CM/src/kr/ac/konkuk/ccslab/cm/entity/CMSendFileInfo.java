package kr.ac.konkuk.ccslab.cm.entity;

import java.io.FileInputStream;

public class CMSendFileInfo extends CMTransFileInfo {
	private String m_strRequesterName;	// the requester name of the sent file
	private String m_strFilePath;	// the path of the sent file
	private Thread m_fileSendThread;
	private FileInputStream m_fis;	// the file input stream that is used to read data of the sent file
	private boolean m_bStarted;
	private boolean m_bSentAll;
	private boolean m_bReceivedAck;

	public CMSendFileInfo()
	{
		super();
		m_strRequesterName = null;
		m_strFilePath = null;
		m_fileSendThread = null;
		m_fis = null;
		m_bStarted = false;
		m_bSentAll = false;
		m_bReceivedAck = false;
	}
	
	public CMSendFileInfo(String strFile, long lSize)
	{
		super(strFile, lSize, -1);
		m_strRequesterName = null;
		m_strFilePath = null;
		m_fileSendThread = null;
		m_fis = null;
		m_bStarted = false;
		m_bSentAll = false;
		m_bReceivedAck = false;
	}
	
	// set/get method
	
	public void setRequesterName(String strName)
	{
		m_strRequesterName = strName;
		return;
	}
	
	public String getRequesterName()
	{
		return m_strRequesterName;
	}
	
	public void setFilePath(String strPath)
	{
		m_strFilePath = strPath;
		return;
	}
	
	public String getFilePath()
	{
		return m_strFilePath;
	}
	
	public void setFileSendThread(Thread thread)
	{
		m_fileSendThread = thread;
		return;
	}
	
	public Thread getFileSendThread()
	{
		return m_fileSendThread;
	}
	
	public void setFileInputStream(FileInputStream fis)
	{
		m_fis = fis;
		return;
	}
	
	public FileInputStream getFileInputStream()
	{
		return m_fis;
	}
	
	public void setStartedToSend(boolean bStarted)
	{
		m_bStarted = bStarted;
		return;
	}
	
	public boolean isStartedToSend()
	{
		return m_bStarted;
	}
	
	public void setSentAll(boolean bSentAll)
	{
		m_bSentAll = bSentAll;
		return;
	}
	
	public boolean isSentAll()
	{
		return m_bSentAll;
	}
	
	public void setReceivedAck(boolean bAck)
	{
		m_bReceivedAck = bAck;
		return;
	}
	
	public boolean isReceivedAck()
	{
		return m_bReceivedAck;
	}
	
}
