package celestial;

public class pm_3<T extends is_3, M extends tW_2<T>> extends qc_3<T, M> {
   private static final rqO_2 id_class = new rqO_2("textures/entity/steve.png");

   public pm_3(pg_3 var1, M var2, float var3) {
      this(var1, (M)var2, var3, 1.0F, 1.0F, 1.0F);
   }

   public pm_3(pg_3 var1, M var2, float var3, float var4, float var5, float var6) {
      super(var1, (M)var2, var3);
      this.id_class(new Tp_1<>(this, var4, var5, var6));
      this.id_class(new TC<>(this));
      this.id_class(new TT<>(this));
   }

   public rqO_2 id_class(T var1) {
      return id_class;
   }
}
