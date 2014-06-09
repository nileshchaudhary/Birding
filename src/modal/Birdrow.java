package modal;

import android.graphics.drawable.Drawable;

public class Birdrow {

String _Engname,_Sciname;
Drawable _image;

/**
 * @param _Engname
 * @param _Sciname
 * @param _iamge
 */
public Birdrow(String _Engname, String _Sciname, Drawable _image) {
	this._Engname = _Engname;
	this._Sciname = _Sciname;
	this._image=_image;
}

/**
 * @return the _Engname
 */
public String get_Engname() {
	return _Engname;
}

/**
 * @param _Engname the _Engname to set
 */
public void set_Engname(String _Engname) {
	this._Engname = _Engname;
}

/**
 * @return the _Sciname
 */
public String get_Sciname() {
	return _Sciname;
}

/**
 * @param _Sciname the _Sciname to set
 */
public void set_Sciname(String _Sciname) {
	this._Sciname = _Sciname;
}

/**
 * @return the _iamge
 */
public Drawable get_image() {
	return _image;
}

/**
 * @param _iamge the _iamge to set
 */
public void set_image(Drawable _iamge) {
	this._image = _image;
}




}
