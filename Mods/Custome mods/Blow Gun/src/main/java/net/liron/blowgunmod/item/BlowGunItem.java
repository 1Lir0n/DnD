package net.liron.blowgunmod.item;

import net.liron.blowgunmod.BlowGunMod;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlowGunItem extends Item {

    public final int stacks=1;
    public final int dmg=3;
    public BlowGunItem(Properties pProperties) {
        super(pProperties);
        //setDamage(getDefaultInstance(),dmg);
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, damage);
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {
        if(!context.getLevel().isClientSide()){
            Player player = context.getPlayer();
            boolean foundEntity = false;
            assert player != null;
            Direction dir = player.getDirection();

            System.out.println(dir.getAxis().getName());int range = 50;
            Vec3 v = player.getViewVector(range).normalize();
            for(int i = 1;i<range;i++) {



            }
        }
        return super.onItemUseFirst(stack, context);
    }
}
