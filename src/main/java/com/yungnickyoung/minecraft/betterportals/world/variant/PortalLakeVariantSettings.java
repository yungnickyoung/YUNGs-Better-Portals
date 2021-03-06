package com.yungnickyoung.minecraft.betterportals.world.variant;

import com.yungnickyoung.minecraft.betterportals.util.RGBAColor;
import com.yungnickyoung.minecraft.yungsapi.world.BlockSetSelector;
import net.minecraft.block.BlockState;

public class PortalLakeVariantSettings {
    public PortalLakeVariantSettings() {}

    private BlockSetSelector blockSelector;
    private RGBAColor fluidColor;
    private int minY;
    private int maxY;
    private int playerTeleportedMinY;
    private int playerTeleportedMaxY;
    private double spawnChance;
    private String spawnDimension;
    private String targetDimension;
    private BlockState spawnPlatformBlock;

    /** Getters **/

    public BlockSetSelector getBlockSelector() {
        return blockSelector;
    }

    public RGBAColor getFluidColor() {
        return fluidColor;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getPlayerTeleportedMinY() {
        return playerTeleportedMinY;
    }

    public int getPlayerTeleportedMaxY() {
        return playerTeleportedMaxY;
    }

    public double getSpawnChance() {
        return spawnChance;
    }

    public String getSpawnDimension() {
        return spawnDimension;
    }

    public String getTargetDimension() {
        return targetDimension;
    }

    public BlockState getSpawnPlatformBlock() {
        return spawnPlatformBlock;
    }

    /** Builder-style setters to make it more obvious which settings are being set when creating a new object **/

    public PortalLakeVariantSettings setBlockSelector(BlockSetSelector selector) {
        this.blockSelector = selector;
        return this;
    }

    public PortalLakeVariantSettings setFluidColor(RGBAColor color) {
        this.fluidColor = color;
        return this;
    }

    public PortalLakeVariantSettings setMinY(int minY) {
        this.minY = minY;
        return this;
    }

    public PortalLakeVariantSettings setMaxY(int maxY) {
        this.maxY = maxY;
        return this;
    }

    public PortalLakeVariantSettings setPlayerTeleportedMinY(int playerTeleportedMinY) {
        this.playerTeleportedMinY = playerTeleportedMinY;
        return this;
    }

    public PortalLakeVariantSettings setPlayerTeleportedMaxY(int playerTeleportedMaxY) {
        this.playerTeleportedMaxY = playerTeleportedMaxY;
        return this;
    }

    public PortalLakeVariantSettings setSpawnChance(double spawnChance) {
        this.spawnChance = spawnChance;
        return this;
    }

    public PortalLakeVariantSettings setSpawnDimension(String spawnDimension) {
        this.spawnDimension = spawnDimension;
        return this;
    }

    public PortalLakeVariantSettings setTargetDimension(String targetDimension) {
        this.targetDimension = targetDimension;
        return this;
    }

    public PortalLakeVariantSettings setSpawnPlatformBlock(BlockState spawnPlatformBlock) {
        this.spawnPlatformBlock = spawnPlatformBlock;
        return this;
    }
}
