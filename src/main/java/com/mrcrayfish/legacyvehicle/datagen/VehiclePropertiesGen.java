package com.mrcrayfish.legacyvehicle.datagen;

import com.mrcrayfish.legacyvehicle.init.ModEntities;
import com.mrcrayfish.legacyvehicle.init.ModSounds;
import com.mrcrayfish.vehicle.client.CameraProperties;
import com.mrcrayfish.vehicle.common.Seat;
import com.mrcrayfish.vehicle.common.entity.Transform;
import com.mrcrayfish.vehicle.datagen.VehiclePropertiesProvider;
import com.mrcrayfish.vehicle.entity.EngineType;
import com.mrcrayfish.vehicle.entity.FuelFillerType;
import com.mrcrayfish.vehicle.entity.Wheel;
import com.mrcrayfish.vehicle.entity.properties.PoweredProperties;
import com.mrcrayfish.vehicle.entity.properties.VehicleProperties;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;

/**
 * Author: MrCrayfish
 */
public class VehiclePropertiesGen extends VehiclePropertiesProvider
{
    public VehiclePropertiesGen(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void registerProperties()
    {
        this.add(ModEntities.ALUMINUM_BOAT.get(), VehicleProperties.builder()
                .setBodyTransform(Transform.create(0.0, 0.0, 0.2, 1.1))
                .setDisplayTransform(Transform.create(1.0))
                .addSeat(Seat.of(-7.0, 8.0, -15.0, true))
                .addSeat(Seat.of(7.0, 6.0, -15.0))
                .addSeat(Seat.of(-7.0, 6.0, 3.0))
                .addSeat(Seat.of(7.0, 6.0, 3.0))
                .setCanBePainted(true)
                .setCanFitInTrailer(false)
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.SMALL_MOTOR)
                        .setEnginePower(12F)
                        .setMinEnginePitch(0.8F)
                        .setMaxEnginePitch(1.5F)
                        .setFuelFillerTransform(Transform.create(-16.0, 3.0, -18.0, 0.0, -90.0, 0.0, 0.25))
                        .setMaxSteeringAngle(20F)
                        .setEnergyCapacity(25000F)
                        .setEnergyConsumptionPerTick(0.5F)
                        .setCanLockWithKey(false)
                        .setEngineSound(ModSounds.ENTITY_SPEED_BOAT_ENGINE.getId())
                        .build()));

        this.add(ModEntities.BUMPER_CAR.get(), VehicleProperties.builder()
                .setAxleOffset(-1.5F)
                .setBodyTransform(Transform.create(1.2))
                .setDisplayTransform(Transform.create(1.5))
                .setHeldOffset(6.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.5625)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0F, -8.5)
                        .setScale(0.47))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0F, -8.5)
                        .setScale(0.47))
                .addSeat(Seat.of(0.0, 1.0, -6.0, true))
                .setCanChangeWheels(true)
                .setCanBePainted(true)
                .setCamera(CameraProperties.builder()
                        .setPosition(0, 1, 0))
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.ELECTRIC_MOTOR)
                        .setEnginePower(5F)
                        .setMaxEnginePitch(0.8F)
                        .setFuelFillerTransform(Transform.create(-8.0, 6.0, -8.0, 0.0, -90.0, 0.0, 0.25))
                        .setFrontAxleOffset(8.5)
                        .setRearAxleOffset(-8.5)
                        .setCanLockWithKey(false)
                        .setEngineSound(ModSounds.ENTITY_BUMPER_CAR_ENGINE.getId())
                        .build()));

        this.add(ModEntities.DUNE_BUGGY.get(), VehicleProperties.builder()
                .setAxleOffset(-2.3F)
                .setBodyTransform(Transform.create(1.3))
                .setDisplayTransform(Transform.create(1.75))
                .setHeldOffset(2.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.025, -0.25)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(2.4, 0.0, 5.3)
                        .setScale(0.625)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(2.4, 0.0, -5.7)
                        .setScale(0.625)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(2.4, 0.0, -5.7)
                        .setScale(0.625)
                        .setParticles(true))
                .addSeat(Seat.of(0.0, 2.0, -3.0, true))
                .setCanChangeWheels(true)
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.SMALL_MOTOR)
                        .setEnginePower(2F)
                        .setFuelFillerTransform(Transform.create(0.0, 3.0, -7.0, 0.0, 180.0, 0.0, 0.25))
                        .setFrontAxleOffset(5.3)
                        .setRearAxleOffset(-5.7)
                        .setEnergyCapacity(5000F)
                        .setCanLockWithKey(false)
                        .setEngineSound(ModSounds.ENTITY_BUMPER_CAR_ENGINE.getId())
                        .build()));

        this.add(ModEntities.MINI_BIKE.get(), VehicleProperties.builder()
                .setAxleOffset(-1.7F)
                .setBodyTransform(Transform.create(1.05))
                .setDisplayTransform(Transform.create(0.0, 0.0, -0.1, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(6.0, 0.0, 0.0)
                .setTrailerOffset(0.0, -0.0625, -0.5)
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(0.0, -0.5 + 1.7 * 0.0625, 13.0)
                        .setScale(1.03)
                        .setParticles(true)
                        .setRender(false))
                .addWheel(Wheel.builder()
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(0.0, 0.0, -6.7)
                        .setScale(1.03)
                        .setParticles(true))
                .addSeat(Seat.of(0.0, 7.0, -2.0, true))
                .setCanChangeWheels(true)
                .setCanBePainted(true)
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.SMALL_MOTOR)
                        .setEnginePower(12F)
                        .setMaxEnginePitch(1.8F)
                        .setEngineTransform(Transform.create(0.0, 1.0, 2.5, 0.0, 180.0, 0.0, 0.7))
                        .setFrontAxleOffset(13)
                        .setRearAxleOffset(-6.7)
                        .setEnergyCapacity(15000F)
                        .setEnergyConsumptionPerTick(0.375F)
                        .setCanLockWithKey(false)
                        .setShowExhaustFumes(true)
                        .setExhaustFumesPosition(0, 8, 0)
                        .setRenderEngine(true)
                        .setEngineSound(com.mrcrayfish.vehicle.init.ModSounds.ENTITY_GO_KART_ENGINE.getId())
                        .build()));

        this.add(ModEntities.SHOPPING_CART.get(), VehicleProperties.builder()
                .setAxleOffset(-1.0F)
                .setBodyTransform(Transform.create(1.05))
                .setDisplayTransform(Transform.create(1.45F))
                .setHeldOffset(4.0, 9.25, 0.0)
                .setTrailerOffset(0.0, -0.03125, -0.25)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setOffset(5.75, 0.0, -10.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setOffset(5.75, 0.0, -10.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 9.5)
                        .setScale(0.47F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(4.0, 0.0, 9.5)
                        .setScale(0.47F))
                .addSeat(Seat.of(0.0, 7.0, -4.0, true))
                .setCanChangeWheels(true)
                .addExtended(PoweredProperties.builder()
                        .setEnginePower(1F)
                        .setFrontAxleOffset(9.5)
                        .setRearAxleOffset(-10.5)
                        .setMaxSteeringAngle(90F)
                        .setEnergyCapacity(0F)
                        .setEnergyConsumptionPerTick(0F)
                        .setCanLockWithKey(false)
                        .build()));

        this.add(ModEntities.SMART_CAR.get(), VehicleProperties.builder()
                .setAxleOffset(-1.7F)
                .setBodyTransform(Transform.create(1.25))
                .setDisplayTransform(Transform.create(1.35F))
                .setHeldOffset(3.0, 1.0, 0.0)
                .setCanTowTrailers(true)
                .setTowBarPosition(0.0, 0.0, -20.0)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 12.0)
                        .setScale(0.9375)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(7.0, 0.0, 12.0)
                        .setScale(0.9375)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0, -12.0)
                        .setScale(0.9375))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(7.0, 0.0, -12.0)
                        .setScale(0.9375))
                .addSeat(Seat.of(0.0, 0.5, -2.0, true))
                .setCanChangeWheels(true)
                .setCanBePainted(true)
                .setCanFitInTrailer(false)
                .setCamera(CameraProperties.builder()
                        .setDistance(5.0))
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.ELECTRIC_MOTOR)
                        .setEnginePower(14F)
                        .setMinEnginePitch(0.8F)
                        .setMaxSteeringAngle(1.6F)
                        .setFuelFillerTransform(Transform.create(-9.0, 8.7, -12.3, 0, -90, 0, 0.25))
                        .setFrontAxleOffset(12)
                        .setRearAxleOffset(-12)
                        .setCanLockWithKey(false)
                        .setEngineSound(ModSounds.ENTITY_BUMPER_CAR_ENGINE.getId())
                        .build()));

        this.add(ModEntities.SPEED_BOAT.get(), VehicleProperties.builder()
                .setAxleOffset(2.5F)
                .setBodyTransform(Transform.create(0.0, -0.03125, 0.6875, 1.0))
                .setDisplayTransform(Transform.create(0.0, 0.0, -0.65, 0.0, 0.0, 0.0, 1.25))
                .setHeldOffset(6.0, -0.5, 0.0)
                .setTrailerOffset(0.0, -0.09375, -0.75)
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .setCanBePainted(true)
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.LARGE_MOTOR)
                        .setEnginePower(20F)
                        .setMinEnginePitch(1.0F)
                        .setMaxEnginePitch(2.0F)
                        .setFuelFillerTransform(Transform.create(0.0, 5.25, -20.5, -90.0, 0.0, 0.0, 0.65))
                        .setEnergyCapacity(25000F)
                        .setEnergyConsumptionPerTick(0.75F)
                        .setCanLockWithKey(false)
                        .setEngineSound(ModSounds.ENTITY_SPEED_BOAT_ENGINE.getId())
                        .setFuelFillerType(FuelFillerType.SMALL)
                        .build()));

        this.add(new ResourceLocation("legacyvehicle", "bath"), VehicleProperties.builder()
                .setDisplayTransform(Transform.create(0.0, 0.0, -0.25, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(4.0, 3.5, 0.0)
                .setTrailerOffset(0.0, 0.0, -0.4375)
                .addSeat(Seat.of(0.0, 0.0, 0.0, true))
                .addExtended(PoweredProperties.builder()
                        .setEnginePower(10F)
                        .setEnergyConsumptionPerTick(0.0F)
                        .setCanLockWithKey(false)
                        .build()));

        this.add(new ResourceLocation("legacyvehicle", "sofa_car"), VehicleProperties.builder()
                .setAxleOffset(-1.5F)
                .setBodyTransform(Transform.create(0.0, -0.0625, 0.0, 0.0, 0.0, 0.0, 1.0))
                .setDisplayTransform(Transform.create(0.0, 0.0, -0.25, 0.0, 0.0, 0.0, 1.5))
                .setHeldOffset(2.0, 2.0, 0.0)
                .setTrailerOffset(0.0, 0.0, -0.25)
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0625, 7.0)
                        .setScale(1.1F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.FRONT)
                        .setOffset(8.0, 0.0625, 7.0)
                        .setScale(1.1F))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.LEFT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 0.0625, -7.0)
                        .setScale(1.1F)
                        .setParticles(true))
                .addWheel(Wheel.builder()
                        .setSide(Wheel.Side.RIGHT)
                        .setPosition(Wheel.Position.REAR)
                        .setOffset(8.0, 0.0625, -7.0)
                        .setScale(1.1F)
                        .setParticles(true))
                .addSeat(Seat.of(0.0, 5.0, 0.0, true))
                .setCanChangeWheels(true)
                .addExtended(PoweredProperties.builder()
                        .setEngineType(EngineType.SMALL_MOTOR)
                        .setEnginePower(10F)
                        .setFuelFillerTransform(Transform.create(0.0, 2.0, 8.0, 0.0, 0.0, 0.0, 0.5))
                        .setFrontAxleOffset(7.0)
                        .setRearAxleOffset(-7.0)
                        .setCanLockWithKey(false)
                        .setEngineSound(com.mrcrayfish.vehicle.init.ModSounds.ENTITY_ATV_ENGINE.getId())
                        .build()));
    }
}
