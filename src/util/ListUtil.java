package util;

import java.util.List;

public final class Lists {
    private Lists(){};

    /**
     * Returns the first item in the given list or null if not found.
     * @param <T> The generic list type.
     * @param list The list that may have first item.
     * @return null if the list is null or there is no first item.*/
    public static <T> T getFirst(final List<T> list){
        return getFirst(list,null);
    }

    /**
     * Returns the first item in the given list or null if not found.
     * @param <T> The generic list type.
     * @param list The list that may have last item.
     * @return null if the list is null or there is no first item.
     */
    public static <T> T getLast(final List<T> list){
        return getLast(list,null);
    }

    /**
     * Returns the first item in the given list or null if not found.
     * @param list The list that may have removable first item.
     * @return null if the list ist null or there is no first item or
     * removed item
     * @param <T> The generic list type
     */
    public static <T> T removeFirst(final List<T> list){
        return removeFirst(list,null);
    }

    /**
     * Returns the first item in the given list or null if not found.
     * @param list The list that may have removable last item.
     * @return null if the list ist null or there is no last item.
     * @param <T> The generic list type.
     */
    public static <T> T removeLast(final List<T> list){
        return removeLast(list,null);
    }

    /**
     * Returns the last item in the given list, or t if not found.
     * @param list The list that may have removable first item.
     * @param t The default return value.
     * @return null if the list ist null or there is no first item.
     * @param <T> The generic list type.
     */
    public static <T> T removeFirst(final List<T> list,final T t){
        return isEmpty(list) ? t : list.remove(0);
    }

    /**
     * Returns the last item in the given list, or t if not found.
     * @param list The list that may have removable last item.
     * @param t The default return value.
     * @return null if the list ist null or there is no last item.
     * @param <T> The generic list type.
     */
    public static <T> T removeLast(final List<T> list,final T t){
        return isEmpty(list) ? t : list.remove(list.size()-1);
    }

    /**
     * Returns the first item in the given list
     * @param <T> The generic list type
     * @param list The list that may have first item.
     * @param t The default return value.
     * @return null if the list is null or there is no first item.
     */
    public static <T> T getFirst(final List<T> list,final T t){
        return isEmpty(list) ? t : list.get(0);
    }

    /**
     * Returns the last item in the given list
     * @param <T> The generic list type
     * @param list The list that may have last item.
     * @param t The default return value.
     * @return null if the list is null or there is no last item.
     */
    public static <T> T getLast(final List<T> list, final T t){
        return isEmpty(list) ? t : list.get(list.size()-1);
    }

    /**
     * Returns true if the given list is null or empty.
     * @param <T> The generic list type.
     * @return true The list is emtpy or null.
     * */
    private static <T> boolean isEmpty(List<T> list) {
        return list.isEmpty() || list == null;
    }
}
