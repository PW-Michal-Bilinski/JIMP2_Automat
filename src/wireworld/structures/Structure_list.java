package wireworld.structures;

import java.util.ArrayList;
import java.util.Iterator;

public class Structure_list  implements Iterable<Structure> {

    private final ArrayList<Structure> struktury;

    public Structure_list(){ struktury = new ArrayList<Structure>(); }

    public void add(Structure s) {struktury.add(s);}

    public void removeElectron(){
        Iterator<Structure> itr = this.struktury.iterator();
        while(itr.hasNext()) {
            Structure tmp = itr.next();
            if ((tmp instanceof ElectronHead ||tmp instanceof ElectronTail)) {
                itr.remove();
            }
        }
    }


    @Override
    public Iterator<Structure> iterator() {
        return struktury.iterator();
    }
}
