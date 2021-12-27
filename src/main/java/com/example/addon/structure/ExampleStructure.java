package com.example.addon.structure;

import com.dfsek.terra.api.Platform;
import com.dfsek.terra.api.block.state.BlockState;
import com.dfsek.terra.api.structure.Structure;
import com.dfsek.terra.api.util.Rotation;
import com.dfsek.terra.api.util.vector.Vector3Int;
import com.dfsek.terra.api.world.WritableWorld;

import java.util.Random;

public class ExampleStructure implements Structure {
    private final Platform platform;

    public ExampleStructure(Platform platform) {
        this.platform = platform;
    }

    @Override
    public boolean generate(Vector3Int location, WritableWorld world, Random random, Rotation rotation) {
        BlockState oakLog = platform.getWorldHandle().createBlockState("minecraft:oak_log[axis=y]");
        BlockState oakLeaves = platform.getWorldHandle().createBlockState("minecraft:oak_leaves[persistent=true]");

        return false;
    }
}
