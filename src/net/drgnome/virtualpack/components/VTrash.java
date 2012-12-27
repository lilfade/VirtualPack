// Bukkit Plugin "VirtualPack" by Siguza
// This software is distributed under the following license:
// http://creativecommons.org/licenses/by-nc-sa/3.0/

package net.drgnome.virtualpack.components;

import net.minecraft.server.v#MC_VERSION#.*;

public class VTrash extends VChest
{
    private EntityPlayer player;
    
    public VTrash(EntityPlayer player)
    {
        super(player, new VTrashInv());
        this.player = player;
    }
    
    public ItemStack clickItem(int i, int j, int meta, EntityHuman entityhuman)
    {
        ItemStack item = super.clickItem(i, j, meta, entityhuman);
        player.updateInventory(player.activeContainer);
        return item;
    }
}