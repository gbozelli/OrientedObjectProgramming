#include "Node.h"

class List: public Node{
  private:
    Node *list;
  public:
    void append(double value){
      list->value = value;
    };
};