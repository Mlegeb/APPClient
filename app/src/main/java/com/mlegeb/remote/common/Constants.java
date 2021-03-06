package com.mlegeb.remote.common;

import android.content.Context;
import android.content.SharedPreferences;
/**
 * 名称: Constants.java
 * 描述: 应用程序配置类-用于保存用户相关信息及设置
 *
 * @author a_xiang
 * @version v1.0
 * @created 2015年2月4日
 */
public class Constants {

	/** 默认Layout Resource **/
	public final static int DEFALUT_LAYOUT_RESOURCE = -0x01;

	/** 端口 */
	public final static int LISTENER_PORT = 7590;
	/** 连接命令 */
	public final static String CONNECTION_STR = "link";
	/** 通知登陆广播 */
	public final static String RETURN_ACTION = "com.mlegeb.socket";
	/** 配置文件名 */
	public final static String PREF_DATA = "pref_data";
	/** 第一次运行主页功能引导 */
	public final static String FIRST_START_PAGE_1 = "first_start_1";
	/** 第一次运行菜单页功能引导 */
	public final static String FIRST_START_PAGE_2 = "first_start_2";

	/* preferences key*/
	public final static String IP_ADDR = "ip_addr";
	public final static String IS_FIRST_OPEN = "is_frist_open";
	public final static String MOUSE_SENSI = "mouse_sensi";


	public final static int INIT_STATE     = 0;  //初始化
	public final static int GAME_STATE     = 1;  //手柄模式
	public final static int INPUT_STATE    = 2;  //输入模式
	public final static int MOUSE_STATE    = 3;  //鼠标模式
	public final static int MUSIC_STATE    = 4;  //播放器模式
	public final static int PPT_STATE      = 5;  //PPT模式
	public final static int SHUTDOWN_STATE = 6;  //关机模式
	public final static int WINDOW_STATE   = 7;  //窗口模式
	
}
