/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9.Exception;

/**
 *
 * @author FIRKY PRIBADY
 */
public class throwsException {
    static void Error() throws ClassNotFoundException{
        System.out.println("Ada Yang Eror Ni!");
        throw new ClassNotFoundException("Eror Sudah Saya Tangkap");
    }
    public static void main(String[] args) {
        try {
            throwsException.Error();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}