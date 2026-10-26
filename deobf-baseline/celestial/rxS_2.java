package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.List;
import java.util.UUID;

public class rxS_2 extends rdb_3 implements eU_2 {
   private static final UUID[] id_finally = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final UT id_class = new rxs_3();
   protected final rXQ id_break;
   private final int id_extends;
   private final float id_native;
   protected final float id_byte;
   protected final rdB_2 id_protected;
   private final Multimap<iJ_2, ix_3> id_volatile;

   public rXQ id_byte() {
      return this.id_break;
   }

   public rxS_2(rdB_2 var1, rXQ var2, rdO_2 var3) {
      super(var3.id_break(var1.id_class(var2)));
      this.id_protected = var1;
      this.id_break = var2;
      this.id_extends = var1.id_break(var2);
      this.id_native = var1.id_throws();
      this.id_byte = var1.id_case();
      dQ_2.id_class(this, id_class);
      Builder var4 = ImmutableMultimap.builder();
      UUID var5 = id_finally[var2.id_break()];
      var4.put(iQ_2.id_implements, new ix_3(var5, "Armor modifier", (double)this.id_extends, id_3.ADDITION));
      var4.put(iQ_2.id_finally, new ix_3(var5, "Armor toughness", (double)this.id_native, id_3.ADDITION));
      if (var1 == rxE_2.NETHERITE) {
         var4.put(iQ_2.id_byte, new ix_3(var5, "Armor knockback resistance", (double)this.id_byte, id_3.ADDITION));
      }

      this.id_volatile = var4.build();
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      rXQ var5 = is_3.id_finally(var4);
      rdn_3 var6 = var2.id_class(var5);
      if (var6.id_class()) {
         var2.id_class(var5, var4.id_implements());
         var4.id_throws(0);
         return rym_3.id_class(var4, var1.id_import());
      } else {
         return rym_3.id_protected(var4);
      }
   }

   @Override
   public Multimap<iJ_2, ix_3> id_class(rXQ var1) {
      return var1 == this.id_break ? this.id_volatile : super.id_class(var1);
   }

   public static boolean id_class(Uq_1 var0, rdn_3 var1) {
      rfH_2 var2 = var0.id_protected().id_break(var0.id_throws().id_byte(dQ_2.id_volatile));
      List var3 = var0.id_catch().id_class(iB_2.class, new rfl_3(var2), rpJ_2.id_catch.and(new rpx_3(var1)));
      if (var3.isEmpty()) {
         return false;
      } else {
         iB_2 var4 = (iB_2)var3.get(0);
         rXQ var5 = is_3.id_finally(var1);
         rdn_3 var6 = var1.id_class(1);
         var4.id_class(var5, var6);
         if (var4 instanceof is_3) {
            ((is_3)var4).id_class(var5, 2.0F);
            ((is_3)var4).b();
         }

         return true;
      }
   }

   @Override
   public boolean id_class(rdn_3 var1, rdn_3 var2) {
      return this.id_protected.id_byte().id_class(var2) || super.id_class(var1, var2);
   }

   public rdB_2 id_throws() {
      return this.id_protected;
   }

   public int id_catch() {
      return this.id_extends;
   }

   @Override
   public int id_protected() {
      return this.id_protected.id_class();
   }

   public float id_private() {
      return this.id_native;
   }
}
