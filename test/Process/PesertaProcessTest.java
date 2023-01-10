/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Entity.PesertaLombaEntity;
import Entity.PesertaTerdatftarEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class PesertaProcessTest {
    
    public PesertaProcessTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPeserta method, of class PesertaProcess.
     */
    @Test
    public void testGetPeserta() {
        System.out.println("getPeserta");
        PesertaProcess instance = new PesertaProcess();
        PesertaLombaEntity[] expResult = null;
        PesertaLombaEntity[] result = instance.getPeserta();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPesertaTerdaftar method, of class PesertaProcess.
     */
    @Test
    public void testGetPesertaTerdaftar() {
        System.out.println("getPesertaTerdaftar");
        PesertaProcess instance = new PesertaProcess();
        PesertaTerdatftarEntity[] expResult = null;
        PesertaTerdatftarEntity[] result = instance.getPesertaTerdaftar();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class PesertaProcess.
     */
    @Test
    public void testInsert_4args() {
        System.out.println("insert");
        String nama = "Adhitya Rega Esa";
        String umur = "212121";
        String alamat = "ITATS";
        String noTelp = "081234567";
        PesertaProcess instance = new PesertaProcess();
        instance.insert(nama, umur, alamat, noTelp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class PesertaProcess.
     */
    @Test
    public void testInsert_3args() {
        System.out.println("insert");
        PesertaLombaEntity peserta = null;
        int index = 0;
        String kodePeserta = "1";
        PesertaProcess instance = new PesertaProcess();
        instance.insert(peserta, index, kodePeserta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class PesertaProcess.
     */
    @Test
    public void testView() {
        System.out.println("view");
        PesertaProcess instance = new PesertaProcess();
        instance.view();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PesertaProcess.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        PesertaProcess instance = new PesertaProcess();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PesertaProcess.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        PesertaProcess instance = new PesertaProcess();
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
