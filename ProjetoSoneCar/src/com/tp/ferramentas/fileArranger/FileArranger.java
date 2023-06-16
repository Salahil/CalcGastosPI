/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.fileArranger;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileArranger {
    public static String chooseImageFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Imagens", "jpg", "jpeg", "png", "gif"));

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile().getPath();
        }

        return null;
    }
}