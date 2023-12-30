package io.github.opencubicchunks.cubicchunks.client.multiplayer;

import java.util.function.BiConsumer;

import io.github.opencubicchunks.cc_core.api.CubePos;
import io.github.opencubicchunks.cubicchunks.world.level.chunk.CubeSource;
import io.github.opencubicchunks.cubicchunks.world.level.chunk.LevelCube;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.protocol.game.ClientboundLevelChunkPacketData;

public interface ClientCubeCache extends CubeSource {

    void drop(int x, int y, int z);

    void updateViewCenter(int x, int y, int z);

    void updateCubeViewRadius(int hDistance, int vDistance);

    LevelCube replaceWithPacketData(int cubeX, int cubeY, int cubeZ, FriendlyByteBuf readBuffer, CompoundTag tag,
                                    BiConsumer<ClientboundLevelChunkPacketData.BlockEntityTagOutput, CubePos> blockEntityTagOutputConsumer);
}