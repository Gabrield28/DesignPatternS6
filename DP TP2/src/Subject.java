
public interface Subject {

	void Add(Observer o);
	void Remove(Observer o);
	void Notify();
}
