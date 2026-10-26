package celestial;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.List;
import java.util.UUID;

public class rxS_2 extends rdb_3 implements eU_2 {
   private static final UUID[] finally_ = new UUID[]{
      UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
      UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
      UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
      UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150")
   };
   public static final UT class_ = new rxs_3();
   protected final rXQ break_;
   private final int extends_;
   private final float native_;
   protected final float byte_;
   protected final rdB_2 protected_;
   private final Multimap<iJ_2, ix_3> volatile_;

   public rXQ byte_() {
      return this.break_;
   }

   public rxS_2(rdB_2 var1, rXQ var2, rdO_2 var3) {
      super(var3.break_(var1.class_(var2)));
      this.protected_ = var1;
      this.break_ = var2;
      this.extends_ = var1.break_(var2);
      this.native_ = var1.throws_();
      this.byte_ = var1.case_();
      dQ_2.class_(this, class_);
      Builder var4 = ImmutableMultimap.builder();
      UUID var5 = finally_[var2.break_()];
      var4.put(iQ_2.implements_, new ix_3(var5, "Armor modifier", (double)this.extends_, id_3.ADDITION));
      var4.put(iQ_2.finally_, new ix_3(var5, "Armor toughness", (double)this.native_, id_3.ADDITION));
      if (var1 == rxE_2.NETHERITE) {
         var4.put(iQ_2.byte_, new ix_3(var5, "Armor knockback resistance", (double)this.byte_, id_3.ADDITION));
      }

      this.volatile_ = var4.build();
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rXQ var5 = is_3.finally_(var4);
      rdn_3 var6 = var2.class_(var5);
      if (var6.class_()) {
         var2.class_(var5, var4.implements_());
         var4.throws_(0);
         return rym_3.class_(var4, var1.import_());
      } else {
         return rym_3.protected_(var4);
      }
   }

   @Override
   public Multimap<iJ_2, ix_3> class_(rXQ var1) {
      return var1 == this.break_ ? this.volatile_ : super.class_(var1);
   }

   public static boolean class_(Uq_1 var0, rdn_3 var1) {
      rfH_2 var2 = var0.protected_().break_(var0.throws_().byte_(dQ_2.volatile_));
      List var3 = var0.catch_().class_(iB_2.class, new rfl_3(var2), rpJ_2.catch_.and(new rpx_3(var1)));
      if (var3.isEmpty()) {
         return false;
      } else {
         iB_2 var4 = (iB_2)var3.get(0);
         rXQ var5 = is_3.finally_(var1);
         rdn_3 var6 = var1.class_(1);
         var4.class_(var5, var6);
         if (var4 instanceof is_3) {
            ((is_3)var4).class_(var5, 2.0F);
            ((is_3)var4).b();
         }

         return true;
      }
   }

   @Override
   public boolean class_(rdn_3 var1, rdn_3 var2) {
      return this.protected_.byte_().class_(var2) || super.class_(var1, var2);
   }

   public rdB_2 throws_() {
      return this.protected_;
   }

   public int catch_() {
      return this.extends_;
   }

   @Override
   public int protected_() {
      return this.protected_.class_();
   }

   public float private_() {
      return this.native_;
   }
}
