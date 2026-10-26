package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FS extends LF implements MinecraftAccessor {
   private final AnimValue id_case = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[1], 0.4F, false);
   public float id_class;
   public float id_throws;

   public FS(int var1, int var2, int var3, int var4, LA var5) {
      super(var1, var2, var3, var4, rgN_2.id_byte, var0 -> {
      }, var5);
      this.id_class = (float)var1;
      this.id_throws = (float)var2;
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      rgN_2 var5 = new rgN_2("Reset Draggables");
      boolean var6 = this.B_();
      int var7 = ((Qw_1)id_import.id_class[20]).id_class(Integer.MIN_VALUE);
      int var8 = var6 ? 16777120 : 16777215;
      cm_3 var9 = (cm_3)id_import.id_class[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.id_continue);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      rrfD_2.id_protected(var1, this.id_class, this.id_throws, (float)this.id_extends, (float)this.id_native, var7);
      id_class(
         var1,
         var9,
         var5,
         this.id_class + (float)this.id_extends / 2.0F,
         this.id_throws + (float)(this.id_native - 8) / 2.0F,
         var8 | rfU_2.id_case(this.id_continue * 255.0F) << 24
      );
      if (var6) {
         this.id_class(var1, var2, var3);
      }
   }

   @Override
   public void id_catch() {
      super.id_catch();
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_class().id_break();
   }

   public AnimValue id_private() {
      return this.id_case;
   }
}
