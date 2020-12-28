package NuclearMod.content;

import arc.graphics.*;
import mindustry.content.Fx;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.ctype.*;
import mindustry.type.*;

import mindustry.ctype.ContentList;

public class NuclLiquid implements ContentList
{
    public static Liquid
    yellowcakeliquid;

    @Override
    public void load(){
        yellowcakeliquid = new Liquid("Yellow Cake Liquid",Color.valueOf("f0e903")){{
           effect = StatusEffects.melting;
           temperature = 1f;
           explosiveness = 1f;
           flammability = 1.2f;
        }};
    }
}
