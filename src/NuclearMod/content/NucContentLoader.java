package NuclearMod.content;

import mindustry.ctype.ContentList;

public class NucContentLoader implements ContentList {
    private final ContentList[] contents = {
        new NuclBlocks(),
        new NuclItems(),
        new NuclLiquid()
    };
    
    @Override
    public void load() {
        for(ContentList list : contents) {
            list.load();
        }
    }
}
