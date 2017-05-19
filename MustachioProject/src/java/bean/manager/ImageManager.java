/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.manager;

import bean.entity.Image;

/**
 *
 * @author Zach Bolan
 */
public class ImageManager extends EntityManager {

	public ImageManager() {
		super(new Image());
	}
	
}
