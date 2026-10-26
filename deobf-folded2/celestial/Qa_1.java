package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class Qa_1 {
   private final long id_class;
   private final List<yM_2> id_break;
   private yM_2 id_byte;
   private int id_protected;
   private int id_throws;

   public int id_byte() {
      return this.id_protected;
   }

   public Qa_1(long var1) {
      this.id_class = var1;
      this.id_break = Lists.newArrayList();
      this.id_class();
   }

   @Override
   public String toString() {
      return String.format("Monitor[%s %sx%s %s]", this.id_class, this.id_protected, this.id_throws, this.id_byte);
   }

   public static yM_2 id_class(List<yM_2> var0, int var1, int var2) {
      for (yM_2 var4 : var0) {
         if (var4.id_class() == var1 && var4.id_break() == var2) {
            return var4;
         }
      }

      return null;
   }

   public yM_2 id_class(int var1) {
      return this.id_break.get(var1);
   }

   public void id_class() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.id_break.clear();
      Buffer var1 = GLFW.glfwGetVideoModes(this.id_class);
      GLFWVidMode var2 = GLFW.glfwGetVideoMode(this.id_class);
      yM_2 var3 = new yM_2(var2);
      ArrayList var4 = new ArrayList();

      for (int var5 = var1.limit() - 1; var5 >= 0; var5--) {
         var1.position(var5);
         yM_2 var6 = new yM_2(var1);
         if (var6.id_byte() >= 8 && var6.id_protected() >= 8 && var6.id_throws() >= 8) {
            if (var6.id_case() < var3.id_case()) {
               var4.add(var6);
            } else {
               this.id_break.add(var6);
            }
         }
      }

      var4.sort(new rrzN_2().reversed());

      for (yM_2 var10 : var4) {
         if (id_class(this.id_break, var10.id_class(), var10.id_break()) == null) {
            this.id_break.add(var10);
         }
      }

      this.id_break.sort(new rrzN_2());
      int[] var9 = new int[1];
      int[] var11 = new int[1];
      GLFW.glfwGetMonitorPos(this.id_class, var9, var11);
      this.id_protected = var9[0];
      this.id_throws = var11[0];
      GLFWVidMode var7 = GLFW.glfwGetVideoMode(this.id_class);
      this.id_byte = new yM_2(var7);
   }

   public int id_class(yM_2 var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return this.id_break.indexOf(var1);
   }

   public yM_2 id_class(Optional<yM_2> var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var1.isPresent()) {
         yM_2 var2 = (yM_2)var1.get();

         for (yM_2 var4 : this.id_break) {
            if (var4.equals(var2)) {
               return var4;
            }
         }
      }

      return this.id_break();
   }

   public yM_2 id_break() {
      return this.id_byte;
   }

   public int id_throws() {
      return this.id_break.size();
   }

   public long id_case() {
      return this.id_class;
   }

   public int id_protected() {
      return this.id_throws;
   }
}
