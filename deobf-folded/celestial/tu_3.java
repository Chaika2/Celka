package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class tu_3 extends wN_2<rSK> {
   private final Iq_1[] id_class = new Iq_1[2];
   private final Iq_1 id_break;
   private final ImmutableList<Iq_1> id_byte;

   public Iq_1 id_byte() {
      return this.id_break;
   }

   public tu_3() {
      Iq_1[] var1 = new Iq_1[]{
         new Iq_1(this, 0, 0).id_break(128, 64),
         new Iq_1(this, 0, 19).id_break(128, 64),
         new Iq_1(this, 0, 27).id_break(128, 64),
         new Iq_1(this, 0, 35).id_break(128, 64),
         new Iq_1(this, 0, 43).id_break(128, 64)
      };
      byte var2 = 32;
      byte var3 = 6;
      byte var4 = 20;
      byte var5 = 4;
      byte var6 = 28;
      var1[0].id_class(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      var1[0].id_class(0.0F, 3.0F, 1.0F);
      var1[1].id_class(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
      var1[1].id_class(-15.0F, 4.0F, 4.0F);
      var1[2].id_class(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
      var1[2].id_class(15.0F, 4.0F, 0.0F);
      var1[3].id_class(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var1[3].id_class(0.0F, 4.0F, -9.0F);
      var1[4].id_class(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var1[4].id_class(0.0F, 4.0F, 9.0F);
      var1[0].id_case = (float) (Math.PI / 2);
      var1[1].id_catch = (float) (Math.PI * 3.0 / 2.0);
      var1[2].id_catch = (float) (Math.PI / 2);
      var1[3].id_catch = (float) Math.PI;
      this.id_class[0] = this.id_class(true);
      this.id_class[0].id_class(3.0F, -5.0F, 9.0F);
      this.id_class[1] = this.id_class(false);
      this.id_class[1].id_class(3.0F, -5.0F, -9.0F);
      this.id_class[1].id_catch = (float) Math.PI;
      this.id_class[0].id_private = (float) (Math.PI / 16);
      this.id_class[1].id_private = (float) (Math.PI / 16);
      this.id_break = new Iq_1(this, 0, 0).id_break(128, 64);
      this.id_break.id_class(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      this.id_break.id_class(0.0F, -3.0F, 1.0F);
      this.id_break.id_case = (float) (Math.PI / 2);
      Builder var7 = ImmutableList.builder();
      var7.addAll(Arrays.asList(var1));
      var7.addAll(Arrays.asList(this.id_class));
      this.id_byte = var7.build();
   }

   protected void id_class(rSK var1, int var2, float var3) {
      float var4 = var1.id_class(var2, var3);
      Iq_1 var5 = this.id_class[var2];
      var5.id_case = (float)rfU_2.id_break((float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((rfU_2.id_class(-var4) + 1.0F) / 2.0F));
      var5.id_catch = (float)rfU_2.id_break((float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((rfU_2.id_class(-var4 + 1.0F) + 1.0F) / 2.0F));
      if (var2 == 1) {
         var5.id_catch = (float) Math.PI - var5.id_catch;
      }
   }

   protected Iq_1 id_class(boolean var1) {
      Iq_1 var2 = new Iq_1(this, 62, var1 ? 0 : 20).id_break(128, 64);
      byte var3 = 20;
      byte var4 = 7;
      byte var5 = 6;
      float var6 = -5.0F;
      var2.id_class(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
      var2.id_class(var1 ? -1.001F : 0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
      return var2;
   }

   public void id_class(rSK var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class(var1, 0, var2);
      this.id_class(var1, 1, var2);
   }

   public ImmutableList<Iq_1> id_break() {
      return this.id_byte;
   }
}
