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
   private final long class_;
   private final List<yM_2> break_;
   private yM_2 byte_;
   private int protected_;
   private int throws_;

   public int byte_() {
      return this.protected_;
   }

   public Qa_1(long var1) {
      this.class_ = var1;
      this.break_ = Lists.newArrayList();
      this.class_();
   }

   @Override
   public String toString() {
      return String.format("Monitor[%s %sx%s %s]", this.class_, this.protected_, this.throws_, this.byte_);
   }

   public static yM_2 class_(List<yM_2> var0, int var1, int var2) {
      for (yM_2 var4 : var0) {
         if (var4.class_() == var1 && var4.break_() == var2) {
            return var4;
         }
      }

      return null;
   }

   public yM_2 class_(int var1) {
      return this.break_.get(var1);
   }

   public void class_() {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      this.break_.clear();
      Buffer var1 = GLFW.glfwGetVideoModes(this.class_);
      GLFWVidMode var2 = GLFW.glfwGetVideoMode(this.class_);
      yM_2 var3 = new yM_2(var2);
      ArrayList var4 = new ArrayList();

      for (int var5 = var1.limit() - 1; var5 >= 0; var5--) {
         var1.position(var5);
         yM_2 var6 = new yM_2(var1);
         if (var6.byte_() >= 8 && var6.protected_() >= 8 && var6.throws_() >= 8) {
            if (var6.case_() < var3.case_()) {
               var4.add(var6);
            } else {
               this.break_.add(var6);
            }
         }
      }

      var4.sort(new rrzN_2().reversed());

      for (yM_2 var10 : var4) {
         if (class_(this.break_, var10.class_(), var10.break_()) == null) {
            this.break_.add(var10);
         }
      }

      this.break_.sort(new rrzN_2());
      int[] var9 = new int[1];
      int[] var11 = new int[1];
      GLFW.glfwGetMonitorPos(this.class_, var9, var11);
      this.protected_ = var9[0];
      this.throws_ = var11[0];
      GLFWVidMode var7 = GLFW.glfwGetVideoMode(this.class_);
      this.byte_ = new yM_2(var7);
   }

   public int class_(yM_2 var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      return this.break_.indexOf(var1);
   }

   public yM_2 class_(Optional<yM_2> var1) {
      RenderSystem.assertThread(RenderSystem::isInInitPhase);
      if (var1.isPresent()) {
         yM_2 var2 = (yM_2)var1.get();

         for (yM_2 var4 : this.break_) {
            if (var4.equals(var2)) {
               return var4;
            }
         }
      }

      return this.break_();
   }

   public yM_2 break_() {
      return this.byte_;
   }

   public int throws_() {
      return this.break_.size();
   }

   public long case_() {
      return this.class_;
   }

   public int protected_() {
      return this.throws_;
   }
}
