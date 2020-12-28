package NuclearMod.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class NuclItems implements ContentList
{
    public static Item
    plutonium, uranium, lowEnrichedUranium, highEnrichedUranium,
    depletedUranium, yellowCake, flowerium;

    @Override
    public void load() {
        plutonium = new Item("Plutonium", Color.valueOf("e6e5e6")){{
            cost = 30;
            hardness = 6;
            explosiveness = 3.0f;
            radioactivity = 1.5f;
        }};

        uranium = new Item("Uranium", Color.valueOf("cfd058")){{
           cost = 15;
           hardness = 8;
           explosiveness =  3.5f;
           radioactivity = 3.0f;
        }};

        lowEnrichedUranium = new Item("Low Enriched Uranium", Color.valueOf("8B8702")){{
            cost = 25;
            explosiveness = 55f;
            radioactivity = 20f;
        }};

        highEnrichedUranium = new Item("High Enriched Uranium",Color.valueOf("90EB09")){{
           cost = 50;
           explosiveness = 100f;
           radioactivity = 40f;
        }};

        depletedUranium = new Item("Depleted Uranium", Color.valueOf("cecece")){{
            cost = 5;
            radioactivity = 0.01f;
        }};

        flowerium = new Item("Flowerium", Color.valueOf("ff2222")){{
            description = "This is very useful material";
            cost = 5;
            radioactivity = 10f;
            explosiveness = 1f;
        }};

        yellowCake = new Item("Yellow Cake", Color.valueOf("d4d431")){{
           description = "This is also called Refined Uranium.";
           cost = 30;
           radioactivity = 30f;
           explosiveness = 35f;
        }};

    }
}
