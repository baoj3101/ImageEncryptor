/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baoj3101
 */
public abstract class ImageEncryptor extends Picture implements Encrypt {
    public abstract boolean encrypt ();
    public abstract boolean decrypt ();
}
