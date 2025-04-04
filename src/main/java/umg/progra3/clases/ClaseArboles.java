package umg.progra3.clases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.progra3.Main;

import java.util.TreeMap;
import java.util.TreeSet;

public class ClaseArboles {
    private static final Logger logger = LogManager.getLogger(ClaseArboles.class);

    // basado en un arbol red-black
    // O(lon n)
    public void TreeSetExample() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        logger.info(treeSet); // 1 2 5 8

    }

    // basado en un arbol red-black
    // O(lon n)
    public void TreeMapExample() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Juan", 25);
        treeMap.put("Ana", 28);
        treeMap.put("Carlos", 17);

        logger.info(treeMap); // { Carlos=17, Juan=25, Ana=28 }

    }
}
