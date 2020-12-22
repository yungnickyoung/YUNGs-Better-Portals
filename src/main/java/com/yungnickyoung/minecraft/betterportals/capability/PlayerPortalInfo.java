package com.yungnickyoung.minecraft.betterportals.capability;

public class PlayerPortalInfo implements IPlayerPortalInfo {
    private int reclaimerCounter;  // counter to increment while player is in reclaimer
    private int reclaimerCooldown; // cooldown before player can teleport again via reclaimer
    private boolean isInReclaimer; // whether or not player is in reclaimer

    private int portalFluidCounter;  // counter to increment while player is in portal fluid
    private int portalFluidCooldown; // cooldown before player can teleport again via portal fluid
    private boolean isInPortalFluid; // whether or not player is in portal fluid

    // Client-only
    private float timeInPortalFluid;
    private float prevTimeInPortalFluid;
    private float timeInReclaimer;
    private float prevTimeInReclaimer;

    // Common getters
    @Override
    public int getReclaimerCounter() {
        return reclaimerCounter;
    }

    @Override
    public int getReclaimerCooldown() {
        return reclaimerCooldown;
    }

    @Override
    public boolean isInReclaimer() {
        return isInReclaimer;
    }

    @Override
    public int getPortalFluidCounter() {
        return portalFluidCounter;
    }

    @Override
    public int getPortalFluidCooldown() {
        return portalFluidCooldown;
    }

    @Override
    public boolean isInPortalFluid() {
        return isInPortalFluid;
    }

    // Common setters
    @Override
    public void setReclaimerCounter(int counter) {
        this.reclaimerCounter = counter;
    }

    @Override
    public void setReclaimerCooldown(int cooldown) {
        this.reclaimerCooldown = cooldown;
    }

    @Override
    public void setInReclaimer(boolean inPortal) {
        this.isInReclaimer = inPortal;
    }

    @Override
    public void setPortalFluidCounter(int portalFluidCounter) {
        this.portalFluidCounter = portalFluidCounter;
    }

    @Override
    public void setPortalFluidCooldown(int portalFluidCooldown) {
        this.portalFluidCooldown = portalFluidCooldown;
    }

    @Override
    public void setInPortalFluid(boolean inPortalFluid) {
        isInPortalFluid = inPortalFluid;
    }

    // Client-only getters
    @Override
    public float getTimeInPortalFluid() {
        return timeInPortalFluid;
    }

    @Override
    public float getPrevTimeInPortalFluid() {
        return prevTimeInPortalFluid;
    }

    @Override
    public float getTimeInReclaimer() {
        return timeInReclaimer;
    }

    @Override
    public float getPrevTimeInReclaimer() {
        return prevTimeInReclaimer;
    }

    // Client-only setters
    @Override
    public void setTimeInPortalFluid(float time) {
        this.timeInPortalFluid = time;
    }

    @Override
    public void setPrevTimeInPortalFluid(float time) {
        this.prevTimeInPortalFluid = time;
    }

    @Override
    public void setTimeInReclaimer(float time) {
        this.timeInReclaimer = time;
    }

    @Override
    public void setPrevTimeInReclaimer(float time) {
        this.prevTimeInReclaimer = time;
    }

    // DEBUG
    private int DEBUGclientTickCounter;
    private int DEBUGserverTickCounter;
    private int DEBUGportalCounter;

    @Override
    public int getDEBUGclientTickCounter() {
        return DEBUGclientTickCounter;
    }

    @Override
    public int getDEBUGserverTickCounter() {
        return DEBUGserverTickCounter;
    }

    @Override
    public int getDEBUGportalCounter() {
        return DEBUGportalCounter;
    }

    @Override
    public void setDEBUGclientTickCounter(int counter) {
        this.DEBUGclientTickCounter = counter;
    }

    @Override
    public void setDEBUGserverTickCounter(int counter) {
        this.DEBUGserverTickCounter = counter;
    }

    @Override
    public void setDEBUGportalCounter(int counter) {
        this.DEBUGportalCounter = counter;
    }
}
