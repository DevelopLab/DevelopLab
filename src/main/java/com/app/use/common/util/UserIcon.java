package com.app.use.common.util;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.use.common.constant.ApplicationConstant;

@Component
public class UserIcon {

	@Autowired
	private ApplicationConstant applicationConstant;

	/**
	 * ユーザアイコン取得処理.
	 *
     * @param id ユーザID
     * @param imageIcon　ユーザのイメージアイコン
     * @return　イメージアイコンのパス
	 */
	public String getUserIcon(String id, String imageIcon) {

		// アイコンを設定していないユーザの場合
		if (imageIcon == null) {
			return this.getDefaultIconPath(id);
		}

		return id + "/" + imageIcon;
	}

    /**
     * デフォルトアイコン取得処理.
     *
     * @param id ユーザID
     * @return　デフォルトアイコンのパス
     */
	private String getDefaultIconPath(String id) {

		File findDir = new File(applicationConstant.getUserIconDirPath() + "/" + id);
		if (!findDir.exists()) {
			if(!this.createFile(findDir)) {
				System.out.println("ユーザのディレクトリ作成に失敗しました。");
			}
		}
		return "default-icon.png";
    }

    /**
     *   ユーザイメージアイコン取得処理.
     *
     * @param id ユーザID
     * @param imageIcon　ユーザのイメージアイコン
     * @return　イメージアイコンのパス
     */
    private String getIconPath(String id, String imageIcon) {

    	String iconPath = "";
		return iconPath;
    }

    private boolean createFile(File newdir) {

        if (newdir.mkdir()){
		    return true;
		}
		return false;
    }
}
