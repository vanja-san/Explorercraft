package com.zathrox.explorercraft.core.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class EntityConfig {

    public static ForgeConfigSpec.BooleanValue brush_stooge_enabled;
    public static ForgeConfigSpec.BooleanValue enderreeper_enabled;
    public static ForgeConfigSpec.BooleanValue enderghast_enabled;
    public static ForgeConfigSpec.BooleanValue infected_creeper_enabled;
    public static ForgeConfigSpec.BooleanValue infected_skeleton_enabled;
    public static ForgeConfigSpec.BooleanValue infected_zombie_enabled;
    public static ForgeConfigSpec.BooleanValue wizard_enabled;

    public static void init(ForgeConfigSpec.Builder common, ForgeConfigSpec.Builder client) {
        common.push("Spawn Entities");
        common.comment("Disable spawning of entities in the mod");
        brush_stooge_enabled = common
                .comment("Decide if you want the Brush Stooge to spawn in your world")
                .define("entity.brush_stooge_enabled", true);
        enderghast_enabled = common
                .comment("Decide if you want the Enderghast to spawn in your world (The End Dimension)")
                .define("entity.enderghast_enabled", true);
        enderreeper_enabled = common
                .comment("Decide if you want the Enderreeper to spawn in your world (The End Dimension)")
                .define("entity.enderreeper_enabled", true);
        infected_creeper_enabled = common
                .comment("Decide if you want the Infected Creeper to spawn in your world")
                .define("entity.infected_creeper_enabled", true);
        infected_skeleton_enabled = common
                .comment("Decide if you want the Infected Skeleton to spawn in your world")
                .define("entity.infested_skeleton_enabled", true);
        infected_zombie_enabled = common
                .comment("Decide if you want the Infected Zombie to spawn in your world")
                .define("entity.infested_skeleton_enabled", true);
        common.pop();
    }
}
