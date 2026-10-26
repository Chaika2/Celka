package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.lwjgl.glfw.GLFWMonitorCallbackI;

public class HN {
   private final Long2ObjectMap<Qa_1> id_class = new Long2ObjectOpenHashMap();
   private final HJ id_break;

   public HN(HJ var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.id_break = var1;
      GLFW.glfwSetMonitorCallback(this::id_class);
      PointerBuffer var2 = GLFW.glfwGetMonitors();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.limit(); var3++) {
            long var4 = var2.get(var3);
            this.id_class.put(var4, var1.createMonitor(var4));
         }
      }
   }

   public Qa_1 id_class(Qg_1 var1) {
      long var2 = GLFW.glfwGetWindowMonitor(var1.id_implements());
      if (var2 != 0L) {
         return this.id_class(var2);
      } else {
         int var4 = var1.id_else();
         int var5 = var4 + var1.id_new();
         int var6 = var1.id_synchronized();
         int var7 = var6 + var1.id_continue();
         int var8 = -1;
         Qa_1 var9 = null;
         ObjectIterator var10 = this.id_class.values().iterator();

         while (var10.hasNext()) {
            Qa_1 var11 = (Qa_1)var10.next();
            int var12 = var11.id_byte();
            int var13 = var12 + var11.id_break().id_class();
            int var14 = var11.id_protected();
            int var15 = var14 + var11.id_break().id_break();
            int var16 = id_class(var4, var12, var13);
            int var17 = id_class(var5, var12, var13);
            int var18 = id_class(var6, var14, var15);
            int var19 = id_class(var7, var14, var15);
            int var20 = Math.max(0, var17 - var16);
            int var21 = Math.max(0, var19 - var18);
            int var22 = var20 * var21;
            if (var22 > var8) {
               var9 = var11;
               var8 = var22;
            }
         }

         return var9;
      }
   }

   public static int id_class(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public void id_class() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GLFWMonitorCallback var1 = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
      if (var1 != null) {
         var1.free();
      }
   }

   public Qa_1 id_class(long var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return (Qa_1)this.id_class.get(var1);
   }

   private void id_class(long var1, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var3 == 262145) {
         this.id_class.put(var1, this.id_break.createMonitor(var1));
      } else if (var3 == 262146) {
         this.id_class.remove(var1);
      }
   }
}
