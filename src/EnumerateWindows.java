/*    */ package net.typingsites.enumeratewindows;
/*    */ 
/*    */ import com.sun.jna.Native;
/*    */ import com.sun.jna.platform.win32.User32;
/*    */ import com.sun.jna.platform.win32.WinDef;
/*    */ import net.typingsites.Main;
/*    */ 
/*    */ public class EnumerateWindows {
/*    */   private static final int MAX_TITLE_LENGTH = 1024;
/*    */   
/*    */   public void getwindow() throws Exception {
/* 14 */     Main main = new Main();
/* 15 */     char[] arrayOfChar = new char[2048];
/* 16 */     WinDef.HWND hWND = User32.INSTANCE.GetForegroundWindow();
/* 17 */     User32.INSTANCE.GetWindowText(hWND, arrayOfChar, 1024);
/* 18 */     System.out.println("Active window title: " + Native.toString(arrayOfChar));
/* 19 */     if (Native.toString(arrayOfChar).startsWith("タイプウェル国語Ｒ")) {
/* 20 */       main.connect(Native.toString(arrayOfChar).replace("タイプウェル国語Ｒ", ""), "undefined", "typewellr", "タイプウェル国語Ｒ");
/* 21 */     } else if (Native.toString(arrayOfChar).startsWith("タイプウェル憲法")) {
/* 22 */       main.connect(Native.toString(arrayOfChar).replace("タイプウェル憲法", ""), "undefined", "twkp", "タイプウェル憲法");
/* 23 */     } else if (Native.toString(arrayOfChar).startsWith("タイプウェル国語Ｋ")) {
/* 24 */       main.connect(Native.toString(arrayOfChar).replace("タイプウェル国語Ｋ", ""), "undefined", "twk", "タイプウェル国語Ｋ");
/* 25 */     } else if (Native.toString(arrayOfChar).startsWith("タイプウェルオリジナル")) {
/* 26 */       main.connect(Native.toString(arrayOfChar).replace("タイプウェルオリジナル", ""), "undefined", "twor", "タイプウェルオリジナル");
/* 27 */     } else if (Native.toString(arrayOfChar).startsWith("タイプウェルＦＴ")) {
/* 28 */       main.connect("undefined", "undefined", "twft", "タイプウェルＦＴ");
/* 29 */     } else if (Native.toString(arrayOfChar).equals("歌謡タイピング劇場")) {
/* 30 */       main.connect("undefined", "undefined", "kayou", Native.toString(arrayOfChar));
/* 31 */     } else if (Native.toString(arrayOfChar).equals("Weather Typing")) {
/* 32 */       main.connect("undefined", "undefined", "weathertyping", Native.toString(arrayOfChar));
/* 33 */     } else if (Native.toString(arrayOfChar).startsWith("TypeLighter: ")) {
/* 34 */       main.connect(Native.toString(arrayOfChar).replace("TypeLighter: ", ""), "undefined", "typelighter", "TypeLighter");
/* 35 */     } else if (Native.toString(arrayOfChar).equals("Form1")) {
/* 36 */       main.connect("undefined", "undefined", "lkm", "limitkpm");
/* 37 */     } else if (Native.toString(arrayOfChar).equals("Niconama Comment Viewer") || Native.toString(arrayOfChar).equals("スリムタイパー") || Native.toString(arrayOfChar).equals(" - ニコ生タイピング") || Native.toString(arrayOfChar).endsWith("ニコ生タイピング")) {
/* 38 */       if (Native.toString(arrayOfChar).endsWith(" - ニコ生タイピング")) {
/* 39 */         main.connect(Native.toString(arrayOfChar).replace(" - ニコ生タイピング", ""), "undefined", "niconama", "ニコ生タイピング");
/*    */       } else {
/* 41 */         main.connect("undefined", "undefined", "niconama", "ニコ生タイピング");
/*    */       } 
/* 43 */     } else if (Native.toString(arrayOfChar).equals("Ozawa-Ken")) {
/* 44 */       main.connect("undefined", "undefined", "ozawaken", Native.toString(arrayOfChar));
/* 45 */     } else if (Native.toString(arrayOfChar).equals("The Typing of the Dead")) {
/* 46 */       main.connect("undefined", "undefined", "undefined", Native.toString(arrayOfChar));
/* 47 */     } else if (Native.toString(arrayOfChar).startsWith("美佳")) {
/* 48 */       main.connect(Native.toString(arrayOfChar), "undefined", "undefined", "美佳のタイプトレーナー");
/* 49 */     } else if (Native.toString(arrayOfChar).startsWith("IshoTyping 1.3.1")) {
/* 50 */       main.connect("undefined", "undefined", "ishotyping", "IshoTyping");
/*    */     }  else if (Native.toString(arrayOfChar).equals("UTyping")) {
/* 50 */       main.connect("undefined", "undefined", "utyping", "UTyping");
/*    */     } 
/*    */   }
/*    */ }
