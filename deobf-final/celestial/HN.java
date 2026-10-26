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
   private final Long2ObjectMap<Qa_1> class_ = new Long2ObjectOpenHashMap();
   private final HJ break_;

   public HN(HJ var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.break_ = var1;
      GLFW.glfwSetMonitorCallback(this::class_);
      PointerBuffer var2 = GLFW.glfwGetMonitors();
      if (var2 != null) {
         for (int var3 = 0; var3 < var2.limit(); var3++) {
            long var4 = var2.get(var3);
            this.class_.put(var4, var1.createMonitor(var4));
         }
      }
   }

   public Qa_1 class_(Qg_1 var1) {
      long var2 = GLFW.glfwGetWindowMonitor(var1.implements_());
      if (var2 != 0L) {
         return this.class_(var2);
      } else {
         int var4 = var1.else_();
         int var5 = var4 + var1.new_();
         int var6 = var1.synchronized_();
         int var7 = var6 + var1.continue_();
         int var8 = -1;
         Qa_1 var9 = null;
         ObjectIterator var10 = this.class_.values().iterator();

         while (var10.hasNext()) {
            Qa_1 var11 = (Qa_1)var10.next();
            int var12 = var11.byte_();
            int var13 = var12 + var11.break_().class_();
            int var14 = var11.protected_();
            int var15 = var14 + var11.break_().break_();
            int var16 = class_(var4, var12, var13);
            int var17 = class_(var5, var12, var13);
            int var18 = class_(var6, var14, var15);
            int var19 = class_(var7, var14, var15);
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

   public static int class_(int var0, int var1, int var2) {
      if (var0 < var1) {
         return var1;
      } else {
         return var0 > var2 ? var2 : var0;
      }
   }

   public void class_() {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      GLFWMonitorCallback var1 = GLFW.glfwSetMonitorCallback((GLFWMonitorCallbackI)null);
      if (var1 != null) {
         var1.free();
      }
   }

   public Qa_1 class_(long var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return (Qa_1)this.class_.get(var1);
   }

   private void class_(long var1, int var3) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      if (var3 == 262145) {
         this.class_.put(var1, this.break_.createMonitor(var1));
      } else if (var3 == 262146) {
         this.class_.remove(var1);
      }
   }
}
