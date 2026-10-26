package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wj_3<T extends rSN> extends wN_2<T> {
   private final Iq_1[] id_class;
   private final Iq_1[] id_break;
   private final ImmutableList<Iq_1> id_byte;

   public wj_3(float var1) {
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1[3];
      this.id_class[0] = new Iq_1(this, 0, 16);
      this.id_class[0].id_class(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, var1);
      this.id_class[1] = new Iq_1(this).id_break(this.id_return, this.id_public);
      this.id_class[1].id_class(-2.0F, 6.9F, -0.5F);
      this.id_class[1].id_class(0, 22).id_class(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, var1);
      this.id_class[1].id_class(24, 22).id_class(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.id_class[1].id_class(24, 22).id_class(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.id_class[1].id_class(24, 22).id_class(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.id_class[2] = new Iq_1(this, 12, 22);
      this.id_class[2].id_class(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, var1);
      this.id_break = new Iq_1[3];
      this.id_break[0] = new Iq_1(this, 0, 0);
      this.id_break[0].id_class(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.id_break[1] = new Iq_1(this, 32, 0);
      this.id_break[1].id_class(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.id_break[1].id_byte = -8.0F;
      this.id_break[1].id_protected = 4.0F;
      this.id_break[2] = new Iq_1(this, 32, 0);
      this.id_break[2].id_class(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.id_break[2].id_byte = 10.0F;
      this.id_break[2].id_protected = 4.0F;
      Builder var2 = ImmutableList.builder();
      var2.addAll(Arrays.asList(this.id_break));
      var2.addAll(Arrays.asList(this.id_class));
      this.id_byte = var2.build();
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      for (int var5 = 1; var5 < 3; var5++) {
         this.id_break[var5].id_catch = (var1.id_class(var5 - 1) - (Float)var1.id_private[23]) * (float) (Math.PI / 180.0);
         this.id_break[var5].id_case = var1.id_break(var5 - 1) * (float) (Math.PI / 180.0);
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = rfU_2.id_break(var4 * 0.1F);
      this.id_class[1].id_case = (0.065F + 0.05F * var7) * (float) Math.PI;
      this.id_class[2].id_class(-2.0F, 6.9F + rfU_2.id_break(this.id_class[1].id_case) * 10.0F, -0.5F + rfU_2.id_class(this.id_class[1].id_case) * 10.0F);
      this.id_class[2].id_case = (0.265F + 0.1F * var7) * (float) Math.PI;
      this.id_break[0].id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_break[0].id_case = var6 * (float) (Math.PI / 180.0);
   }

   public ImmutableList<Iq_1> id_break() {
      return this.id_byte;
   }
}
