/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Entity.PanitiaEntity;
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
public class PanitiaProcessTest {
    
    public PanitiaProcessTest() {
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
     * Test of getPanitia method, of class PanitiaProcess.
     */
    @Test
    public void testGetPanitia() {
        System.out.println("getPanitia");
        PanitiaProcess instance = new PanitiaProcess();
        PanitiaEntity[] expResult = null;
        PanitiaEntity[] result = instance.getPanitia();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class PanitiaProcess.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String namaPanitia[]={"Rega", "Adit", "Esa"};
        String passPanitia[]={"01", "02", "03"};
        String noTelpPanitia[]={"08123456", "082321234", "083123456"};
        String alamatPanitia[]={"jl.Ranah", "jl.Tengah", "jl.KananKiri"};
        PanitiaProcess instance = new PanitiaProcess();
        instance.insert(passPanitia, namaPanitia, noTelpPanitia, alamatPanitia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of view method, of class PanitiaProcess.
     */
    @Test
    public void testView() {
        System.out.println("view");
        PanitiaProcess instance = new PanitiaProcess();
        instance.view();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cekData method, of class PanitiaProcess.
     */
    @Test
    public void testCekData() {
        System.out.println("cekData");
        String user = "Rega";
        String password = "01";
        PanitiaProcess instance = new PanitiaProcess();
        int expResult = 0;
        int result = instance.cekData(user, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
